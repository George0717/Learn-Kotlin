fun main() {
    cetakNama()
    println("===========")
    cetakPerkalian()
    cetakPerkalian2(50, 10)
    var hasilKali = perkalian(5, 8)
    println(hasilKali)
    val hasilMultiplyAndDivide = multiplyAndDivide(10, 5)
    println(hasilMultiplyAndDivide) // cetak Pair(50, 2)

    val hasilMultiply = hasilMultiplyAndDivide.first
    val hasilBagi = hasilMultiplyAndDivide.second

    println("Hasil Kali = $hasilMultiply")
    println("Hasil Bagi = $hasilBagi")
    println(multiplyInferred(10,20))
}


fun cetakNama() {
    println("Nama Saya George")
}

fun cetakPerkalian(nilai: Int = 5) {
    print("Masukkan angka : ")
    var angka = readln().toInt();
    println("hasil = ${angka * nilai}" )
}

fun cetakPerkalian2(pengali: Int, nilai: Int)
{
    println("$pengali * $nilai = ${pengali * nilai}")
}

fun perkalian(nilai: Int, pengali: Int): Int{
    return nilai * pengali
}

fun multiplyAndDivide(number: Int, factor: Int): Pair<Int, Int> {
    return Pair(number * factor, number / factor)
}

fun multiplyInferred(number: Int, factor: Int) = Pair(number * factor, number / factor)

fun incrementAndPrint(value: Int) {
    val newValue = value + 1
    println(newValue)
}

fun getValue(value: String): String {
    return "The value is $value"
}


