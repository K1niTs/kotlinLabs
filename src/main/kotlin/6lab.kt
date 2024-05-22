//1 Способ
//fun <T> List<T>.filter(predicate: (T) -> Boolean): List<T> {
//    val result = mutableListOf<T>()
//    for (item in this) {
//        if (predicate(item)) {
//            result.add(item)
//        }
//    }
//    return result
//}
//
//fun main() {
//    val numbers = listOf(1, 2, 3, 4, 5, 6)
//    val evenNumbers = numbers.filter { it % 2 == 0 }
//    println(evenNumbers) // [2, 4, 6]
//}
//2 Способ
//fun multiply(factor: Int): (Int) -> Int {
//    return { number -> factor * number }
//}
//
//fun main() {
//    val multiplyBy3 = multiply(3)
//    println(multiplyBy3(4)) // 12
//    println(multiplyBy3(5)) // 15
//}
//
