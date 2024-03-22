//24,-63,67,-12,88,94,-28,82,0,53

fun main() {
    val array = readLine()?.split(",")?.map { it.toInt() }

    if (array != null && array.isNotEmpty()) {
        val min = array.min()
        val max = array.max()

        println("Минимальный элемент: $min")
        println("Максимальный элемент: $max")
    } else {
        println("Не правильно набрано")
    }
}
