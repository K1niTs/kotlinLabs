fun main() {
    val scan = java.util.Scanner(System.`in`)
    val a = scan.nextInt()
    val firstNumber = a / 1000 % 10
    val secondNumber = a / 100 % 10
    val thirdNumber = a / 10 % 10
    val fourthNumber = a % 10
    println("Результат: $firstNumber, $secondNumber, $thirdNumber, $fourthNumber")
}