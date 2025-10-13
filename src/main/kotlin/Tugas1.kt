fun main() {
    // Membuat konstanta Pair dengan nilai (2, 3)
    val coordinates = Pair(2, 3)

    // Mengekstrak nilai ke dalam dua variabel row dan column
    val (row, column) = coordinates

    // Cetak hasil untuk verifikasi
    println("Row: $row, Column: $column")

    val n = 10
    println("Fibonacci ke-$n = ${fibonacci(n)}")
}


fun fibonacci(n: Int): Int {
    return if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
}