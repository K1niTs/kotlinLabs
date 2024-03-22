

fun main() {
    val scan = java.util.Scanner(System.`in`)
    print("Введите ваш возраст: ")
    val age: Int = scan.nextInt()

    if (age != null) {
        when {
            age > 18 -> println("Вам уже все можно")
            age == 18 -> println("Ура, Вам 18 лет!")
            else -> println("Вы еще слишком молоды")
        }
    }
}


