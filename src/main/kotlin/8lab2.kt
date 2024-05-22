import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import kotlinx.coroutines.*
import java.io.File

suspend fun main() {
    val client = HttpClient(CIO)

    val urls = generateRandomImageUrls(100)
    val outputDirectory = "src/main/images1/"
    File(outputDirectory).mkdirs()

    try {
        downloadImages(client, urls, outputDirectory) { index, url, directory ->
            val fileName = "random_${index + 1}.jpg"
            downloadAndSaveImage(client, url, fileName, directory)
        }
    } finally {
        client.close()
    }
}

suspend fun downloadImages(client: HttpClient, urls: List<String>, outputDirectory: String, downloadFunction: suspend (Int, String, String) -> Unit) {
    withContext(Dispatchers.IO) {
        urls.mapIndexed { index, url ->
            launch(CoroutineName("downloader-$index")) {
                try {
                    downloadFunction(index, url, outputDirectory)
                } catch (e: Exception) {
                    println("Failed to download and save image: ${e.message}")
                }
            }
        }.joinAll()
    }
}

suspend fun downloadAndSaveImage(client: HttpClient, url: String, fileName: String, outputDirectory: String) {
    val bytes: ByteArray = client.get(url).body<ByteArray>()
    val filePath = "$outputDirectory/$fileName"
    try {
        File(filePath).writeBytes(bytes)
        println("Saved file as $filePath")
    } catch (e: Exception) {
        println("Failed to write file: ${e.message}")
    }
}

suspend fun generateRandomImageUrls(count: Int): List<String> {
    val baseUrl = "https://source.unsplash.com/random/100x100" // Получаем случайное изображение с Unsplash
    return List(count) { index ->
        "$baseUrl?sig=${index + 1}" // Добавляем уникальный параметр, чтобы получить разные изображения
    }
}
