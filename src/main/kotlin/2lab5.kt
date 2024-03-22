

fun main() {
    val scan = java.util.Scanner(System.`in`)
    val num1: Int = scan.nextInt()
    val num2: Int = scan.nextInt()
    val num3: Int = scan.nextInt()

    val average = when {
        num1 == num2 || num1 == num3 || num2 == num3 -> "Ошибка"
        else -> (num1 + num2 + num3) / 3
    }
    println("Среднее число: $average")
}
