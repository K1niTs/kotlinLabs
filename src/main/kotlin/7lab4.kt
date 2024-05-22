import kotlinx.coroutines.*

suspend fun executeWithTimeout(body: suspend () -> Unit) {
    try {
        withTimeout(1000) {
            body()
        }
    } catch (e: TimeoutCancellationException) {
        println("Слишком долгое выполнение")
    }
}

suspend fun longRunningTask() {
    delay(1500)
    println("Долгая операция завершена")
}

suspend fun shortRunningTask() {
    delay(500)
    println("Короткая операция завершена")
}

fun main() = runBlocking<Unit> {
    println("Выполнение долгой операции с таймаутом:")
    executeWithTimeout { longRunningTask() }

    println("\nВыполнение короткой операции с таймаутом:")
    executeWithTimeout { shortRunningTask() }
}
