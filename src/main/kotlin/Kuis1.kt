import kotlin.reflect.typeOf

fun main() {
    var i = 10
    while (i >= 0) {
        println(i)
        i--
    }

    val a = 4
    val b: Short = 100
    val c: Byte = 12

    var hasil = a + b - c
    println(hasil)

    // Cetak tipe data hasil
    println("Tipe data hasil: ${hasil::class.simpleName}")
}
