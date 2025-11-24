package Tugas3

class Karyawan(
    val nama: String,
    var jabatan: String,
    var gaji: Double
) {
    fun naikGaji(persen: Double) {
        gaji += gaji * persen / 100
    }

    fun tampilInfo() {
        println("Nama: $nama | Jabatan: $jabatan | Gaji: Rp ${"%,.2f".format(gaji)}")
    }
}

class Perusahaan(val namaPerusahaan: String) {
    private val daftarKaryawan = mutableListOf<Karyawan>()

    fun tambahKaryawan(karyawan: Karyawan) {
        daftarKaryawan.add(karyawan)
    }

    fun tampilkanKaryawan() {
        println("Daftar Karyawan di $namaPerusahaan:")
        daftarKaryawan.forEach { it.tampilInfo() }
    }
}

fun main() {
    val perusahaan = Perusahaan("PT Kotlin Nusantara")

    val k1 = Karyawan("Andi", "Programmer", 7000000.0)
    val k2 = Karyawan("Budi", "Manager", 12000000.0)
    val k3 = Karyawan("Citra", "Desainer", 8000000.0)

    perusahaan.tambahKaryawan(k1)
    perusahaan.tambahKaryawan(k2)
    perusahaan.tambahKaryawan(k3)

    // Naikkan gaji salah satu karyawan
    k1.naikGaji(10.0)

    perusahaan.tampilkanKaryawan()
}
