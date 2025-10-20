// ==========================
// Definisi Class
// ==========================

class Contact(var fullname: String, var emailAddress: String)
class Contact2(var fullname: String, val emailAddress: String)
class Contact3(var fullname: String, val emailAddress: String, var type: String)

class MyPerson(val firstName: String, val lastName: String) {
    val fullName = "$firstName $lastName"
}

class Address {
    var address1: String
    var address2: String? = null
    var city = ""
    var state: String
    init {
        address1 = ""
        state = ""
    }
}

// ==========================
// Class TV
// ==========================

class TV(var height: Int, var width: Int) {
    fun showSize() {
        println("Ukuran TV ini adalah ${height} inci (tinggi) x ${width} inci (lebar)")
    }

    fun calculateDiagonal(): Double {
        val sumOfSquares = (height * height + width * width).toDouble()
        return Math.sqrt(sumOfSquares)
    }

    fun showInfo() {
        showSize()
        val diagonalValue = calculateDiagonal()
        println("Diagonal TV ini adalah %.2f inci".format(diagonalValue))
    }
}

// ==========================
// Class GameLevel (dengan Companion Object + highest info)
// ==========================

class GameLevel(val id: Int, val boss: String, var unlocked: Boolean) {
    fun showInfo() {
        println("Level $id - Boss: $boss - Status: ${if (unlocked) "Unlocked" else "Locked"}")
    }

    companion object {
        // Konstanta level tertinggi yang tersedia dalam game
        const val MAX_LEVEL = 4

        // Static-like level instances
        val level1 = GameLevel(1, "Goblin King", true)
        val level2 = GameLevel(2, "Dark Knight", false)
        val level3 = GameLevel(3, "Fire Dragon", false)
        val level4 = GameLevel(4, "Shadow Lord", false)

        // Koleksi semua level (mempermudah operasi)
        private val allLevels = listOf(level1, level2, level3, level4)

        // Properti yang merujuk ke objek level tertinggi (berdasarkan id)
        val highestLevel: GameLevel
            get() = allLevels.first { it.id == MAX_LEVEL }

        // Mengembalikan level tertinggi yang sudah di-unlock (atau null)
        fun highestUnlockedLevel(): GameLevel? {
            return allLevels
                .filter { it.unlocked }
                .maxByOrNull { it.id } // tertinggi berdasarkan id
        }

        // Tampilkan semua level
        fun showAllLevels() {
            println("=== Daftar Level Game ===")
            allLevels.forEach { it.showInfo() }
            println("==========================")
        }

        // Unlock next level setelah currentId selesai
        fun unlockNextLevel(currentId: Int) {
            when (currentId) {
                1 -> level2.unlocked = true
                2 -> level3.unlocked = true
                3 -> level4.unlocked = true
                else -> println("Tidak ada level berikutnya atau sudah mencapai max level.")
            }
        }

        // Unlock hingga level tertentu (mis. unlock sampai level 3)
        fun unlockUpTo(targetId: Int) {
            if (targetId < 1 || targetId > MAX_LEVEL) {
                println("Target id tidak valid: $targetId")
                return
            }
            allLevels.filter { it.id <= targetId }.forEach { it.unlocked = true }
        }
    }
}

// ==========================
// Main Function (contoh penggunaan)
// ==========================

fun main() {
    // Contoh penggunaan kelas lain
    val contact = Contact("Mozambik", "mozambique@ksk.com")
    println("Nama: ${contact.fullname}")
    println("Email: ${contact.emailAddress}")

    val person = MyPerson("Wut", "Wot")
    println("Nama lengkap person: ${person.fullName}")

    val myTV = TV(32, 55)
    myTV.showInfo()

    // ==========================
    // Companion Object Example
    // ==========================
    println("\n=== SISTEM LEVEL GAME ===")
    GameLevel.showAllLevels()

    // Tampilkan highest level (konsep 'max' level di game)
    println("\nHighest level available (by design): Level ${GameLevel.highestLevel.id} - Boss: ${GameLevel.highestLevel.boss}")

    // Tampilkan highest unlocked saat ini (bisa null)
    val highestUnlockedBefore = GameLevel.highestUnlockedLevel()
    println("Highest unlocked level saat ini: ${highestUnlockedBefore?.id ?: "None"}")

    println("\n==> Player menyelesaikan Level 1")
    GameLevel.unlockNextLevel(1)

    println("\nStatus setelah update:")
    GameLevel.showAllLevels()

    val highestUnlockedAfter = GameLevel.highestUnlockedLevel()
    println("Highest unlocked level sekarang: ${highestUnlockedAfter?.id ?: "None"}")

    // Contoh unlockUpTo
    println("\nUnlock up to level 3 (fungsi unlockUpTo)")
    GameLevel.unlockUpTo(3)
    GameLevel.showAllLevels()
    println("Highest unlocked level akhirnya: ${GameLevel.highestUnlockedLevel()?.id ?: "None"}")
}
