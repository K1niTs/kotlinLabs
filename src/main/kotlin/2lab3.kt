
fun main() {
    val number1 = 2
    val number2 = 6

    val scan = java.util.Scanner(System.`in`)

    println("У вас есть числа: $number1 и $number2")
    println("1. Добавить")
    println("2. Отнять")
    println("0. Ничего")

    val pick: Int = scan.nextInt()
    when (pick) {
        1 -> println("Результат добавления: ${number1 + number2}")
        2 -> println("Результат отнимания: ${number1 - number2}")
        0 -> println("Ничего")
    }
}
