package Tugas4

fun filterEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 == 0 }
}

fun main() {
    val data = listOf(1, 2, 3, 4, 5, 6)
    val evenNumbers = filterEvenNumbers(data)
    println(evenNumbers)
}
