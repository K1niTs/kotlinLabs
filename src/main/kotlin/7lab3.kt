import kotlinx.coroutines.*
import kotlin.random.Random

suspend fun performTask(index: Int): Pair<Int, Boolean> {
    val number = Random.nextInt(1000)
    val isEven = number % 2 == 0
    return Pair(index, isEven)
}

fun main() = runBlocking<Unit> {
    val results = mutableListOf<Pair<Int, Boolean>>()

    val jobs = List(100_000) { index ->
        launch {
            val result = performTask(index)
            results.add(result)
        }
    }

    jobs.forEach { it.join() }

    val successfulTasks = results.count { it.second }

    println("Количество успешно выполненных задач: $successfulTasks")
}
