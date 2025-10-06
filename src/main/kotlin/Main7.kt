fun main() {
//    Maps & Sets
//    Mat<K,V>
//    mapOf nilai yang tidak bisa diubah
    var tahunKelahiran = mapOf("Anna" to 1990, "Brian" to 1991, "Craig" to 1992, "Donna" to 1993)
    println(tahunKelahiran)

//    MutableMapOf nilai yang masih bisa diubah
    var skorGame = mutableMapOf("Anna" to 2, "Brian" to 4, "Anton" to 10)
    println(skorGame)

//    skorGame = mutableMapOf() // membuat map kosong
    var pairs = HashMap<String, Int>() // Membuat map kosong baru dengan memanggil konstruktor map
    pairs = HashMap<String, Int>(20) // Membuat map dengan menentukan kapasitasnya

//    Akses Value dari Map
    println(skorGame["Brian"])
    println(skorGame["Anna"])
    println(skorGame.get("Anna"))
    println(skorGame.get("Anton"))

    println(skorGame.isEmpty())
    println(skorGame.size)

    val bobData = mutableMapOf("name" to "Bob", "profession" to "Cardlayer", "country" to "USA")
    bobData.put("state", "CA")
    bobData["city"] = "San Fransisco"
    println(bobData)

//    Cara Update Value berdasarkan key di mutable map
    bobData.put("name", "Robux")
    bobData["profession"] = "Mailman"
    println(bobData)

//    Menggunakan operator infix += untuk menambahkan pasangan key/value baru ke mutablemap
    val pairData = "nickname" to "Bobby D"
    bobData += pairData
    println(bobData)

// remove value
    bobData.remove("city")
    bobData.remove("state", "CA")
    println(bobData)

//    Looping
    for ((player, score) in skorGame){
        if (score > 5) {
            println("$player with score $score a Best Player")
        } else {
          println("$player with score $score a Regular Player")
        }
    }

//    Sets
    val names = setOf("Anna", "Brian", "Bagusto", "Mephisto", "AngkaraMessi")
    println(names)
    val hashSet = HashSet<Int>() // Membuat satu set kosong dengan memanggil konstruktor

//    Set from arrays
    val bilBulatArray = arrayOf(1,2,3,1)
    var bilBulatSet = mutableSetOf(*bilBulatArray) // * adalah spread operator
    println(bilBulatSet)

//    Menggunakan contains
    println(bilBulatSet.contains(1)) // true

//    menggunakan in
    println(4 in bilBulatSet) // fales

//    menambahkan element
    bilBulatSet.add(5)
    println(bilBulatSet)

//    Menghapus element
    val removedOne = bilBulatSet.remove(5)
    println(removedOne) // true
    println(bilBulatSet) // [1,2,3]
}
