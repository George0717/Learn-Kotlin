package Tugas2

fun divideIfWhole(num: Int, divisor: Int): Int? {
    return if (num % divisor == 0) num / divisor else null
}

fun main() {
    val answer = divideIfWhole(10, 2)

    // Kasus pertama: if biasa
    if (answer != null) {
        println("Yep, it divides $answer times")
    } else {
        println("Not divisible :[")
    }

    // Kasus kedua: menggunakan Elvis operator
    val result = divideIfWhole(10, 3) ?: 0
    println("It divides $result times")
}