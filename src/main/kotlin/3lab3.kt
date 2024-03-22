

fun main() {
    print("Ваше произвольное число: ")
    val scan = java.util.Scanner(System.`in`)
    val number: Int = scan.nextInt()

    if (number != null) {
        println("$number")
        for (i in 1..number) {
            if (number % i == 0) {
                print("$i ")
            }
        }
    }
}


