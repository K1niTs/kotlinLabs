fun main() {
    println("Введите число:")

    val scan = java.util.Scanner(System.`in`)
    val input: Int = scan.nextInt()

    val number = input.toInt()
    var evenNumber = 0
    var oddNumber = 0

    var num = number
    while (num > 0) {
        val digit = num % 10
        if (digit % 2 == 0) {
            evenNumber++
        } else {
            oddNumber++
        }
        num /= 10
    }
    println("Количество четных цифр: $evenNumber")
    println("Количество нечетных цифр: $oddNumber")
}
