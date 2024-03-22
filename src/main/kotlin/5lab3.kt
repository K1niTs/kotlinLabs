
fun calculateDiscount(classicPrice: Double, discountPrice: Double): Double {
    val discountPrice = classicPrice * (discountPrice / 100)
    return (classicPrice - discountPrice).roundTo(2)
}

fun Double.roundTo(decimals: Int): Double {
    val multiplier = Math.pow(10.0, decimals.toDouble())
    return Math.round(this * multiplier) / multiplier
}

fun main() {
    val classicPrice = 1000.0
    val discountPrice = 15.0

    val finalPrice = calculateDiscount(classicPrice, discountPrice)
    println("Цена без скидки $classicPrice")
    println("Скидка: $discountPrice%")
    println("Итог: $finalPrice")
}
