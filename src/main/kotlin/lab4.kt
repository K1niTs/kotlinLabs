fun main() {
    val allDays: Int = 2642
    val years = allDays / 365
    val remainDays = allDays % 365

    val weeks = remainDays / 7
    val days = remainDays % 7
    println("Лет: $years, недель: $weeks, дней: $days")
}
