package Tugas2

fun main() {
    val factorial: (Int) -> Int = { n ->
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        result
    }

    println("Faktorial dari 12 adalah: ${factorial(12)}")
}
