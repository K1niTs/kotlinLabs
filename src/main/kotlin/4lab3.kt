

fun main() {
    val array = mutableListOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)

    val min = array.minOrNull()
    val max = array.maxOrNull()

    println("Минимальный элемент $min")
    println("Максимальный элемент: $max")
}