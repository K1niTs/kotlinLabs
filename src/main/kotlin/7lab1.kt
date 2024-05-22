import kotlinx.coroutines.*
import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun main() {
    GlobalScope.launch {
        while (true) {
            val currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))
            println("Текущее время: $currentTime")
            delay(1000L)
        }
    }

    Thread.sleep(Long.MAX_VALUE)
}
