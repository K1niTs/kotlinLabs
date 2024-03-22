

fun Int.yearsEnding(): String {
    return when {
        this % 10 == 1 && this % 100 != 11 -> "$this год"
        this % 10 in 2..4 && (this % 100 < 10 || this % 100 >= 20) -> "$this года"
        else -> "$this лет"
    }
}

fun main() {
    println(1.yearsEnding())
    println(2.yearsEnding())
    println(5.yearsEnding())
    println(10.yearsEnding())
    println(24.yearsEnding())

}
