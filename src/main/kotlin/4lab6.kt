//5, 8, 18, 34, 3, 56, 43, 27, 4, 23

fun main() {
    val array = readLine()?.split(",")?.map { it.trim().toInt() }

    if (array != null && array.isNotEmpty()) {
        val average = array.average()
        println("Среднее: $average")

        val moreAverage = array.filter { it > average }
        println("Больше среднего значения: ${moreAverage.joinToString()}")
    } else {
        println("Неверно")
    }
}
