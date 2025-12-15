package Tugas4

class DivisionByZeroException(message: String) : Exception(message)

fun divide(a: Int, b: Int): Int {
    if (b == 0) {
        throw DivisionByZeroException("Pembagian oleh 0 tidak diizinkan.")
    }
    return a / b
}

fun main() {
    try {
        val result = divide(10, 0)
        println("Hasil: $result")
    } catch (e: DivisionByZeroException) {
        println(e.message)
    }
}
