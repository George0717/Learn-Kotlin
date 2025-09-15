fun main() {
    //    ani membeli 7 buku, tiap buku harganya Rp.50.000. Toko memberi dikson 15%. Buatlah program kotlin untuk menghitung total harga yang harus dibayar ani
    val buku: Int = 7
    val subTotal: Int = buku * 50000
    val diskon: Double = subTotal * 0.15
    val totalHarga: Double = subTotal - diskon
    println("Jumlah Bayar : $totalHarga")
}