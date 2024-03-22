

fun main() {
    var sum = 0
    for (i in 1..100) {
        if (i % 4 == 0) {
            sum += i
        }
    }
    println("$sum")
}
