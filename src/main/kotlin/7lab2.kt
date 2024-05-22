import kotlinx.coroutines.*
import kotlin.math.pow
import kotlin.math.sqrt

suspend fun complexMathOperation(x: Double, y: Double): Double {
    delay(2000L)
    return sqrt(x.pow(2) + y.pow(2))
}

fun main() {
    GlobalScope.launch {
        val result = complexMathOperation(3.0, 4.0)
        println("Результат: $result")
    }
    Thread.sleep(3000L)
}
