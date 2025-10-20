class MyMath {
    companion object {
        fun factorial(number: Int): Int {
            return (1..number).fold(1) { a, b -> a * b }
        }
    }
}

fun main() {
    // ArrayList example
    val numbers = arrayListOf(1, 2, 3)
    numbers.removeAt(numbers.lastIndex)
    println(numbers) // [1, 2]

    // List global bulan
    val months = listOf(
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    )

    // ======================
    // SimpleDate1
    // ======================
    class SimpleDate1(var month: String) {
        fun monthsUntilWinterBreak(from: SimpleDate1): Int {
            return months.indexOf("December") - months.indexOf(from.month)
        }
    }

    val date1 = SimpleDate1("October")
    println("SimpleDate1: ${date1.monthsUntilWinterBreak(SimpleDate1("August"))} bulan lagi ke Desember")

    // ======================
    // SimpleDate2
    // ======================
    class SimpleDate2(var month: String) {
        fun monthsUntilWinterBreak(from: SimpleDate2): Int {
            return months.indexOf("December") - months.indexOf(from.month)
        }
    }

    val date2 = SimpleDate2("October")
    println("SimpleDate2: ${date2.monthsUntilWinterBreak(SimpleDate2("September"))} bulan lagi ke Desember")

    // ======================
    // SimpleDate3
    // ======================
    class SimpleDate3(var month: String) {
        fun monthsUntilWinterBreak(from: SimpleDate3): Int {
            return months.indexOf("December") - months.indexOf(from.month)
        }
    }

    val date3 = SimpleDate3("October")
    println("SimpleDate3: ${date3.monthsUntilWinterBreak(SimpleDate3("October"))} bulan lagi ke Desember")

    // ======================
    // ✅ SimpleDate4 (baru ditambahkan)
    // ======================
    class SimpleDate4(var month: String) {
        fun monthsUntilWinterBreak(from: SimpleDate4): Int {
            return months.indexOf("December") - months.indexOf(from.month)
        }
    }

    val date4 = SimpleDate4("October")
    println("SimpleDate4: ${date4.monthsUntilWinterBreak(SimpleDate4("November"))} bulan lagi ke Desember")

    // ======================
    // SimpleDate untuk summer break
    // ======================
    class SimpleDate() {
        var month: String = "January"
        fun monthsUntilWinterBreak(from: SimpleDate4): Int {
            return months.indexOf("December") - months.indexOf(from.month)
        }
    }

    // ✅ Fungsi ekstensi diperbaiki (hasil Desember = 6)
    fun SimpleDate.monthsUntilSummerBreak(): Int {
        val monthIndex = months.indexOf(month)
        val juneIndex = months.indexOf("June")
        val augustIndex = months.indexOf("August")

        return when {
            monthIndex == -1 -> -1 // jika bulan tidak valid
            monthIndex < juneIndex -> juneIndex - monthIndex // sebelum Juni
            monthIndex in juneIndex..augustIndex -> 0 // sedang summer
            else -> (12 - monthIndex) + juneIndex // setelah Agustus
        }
    }

    val date = SimpleDate()
    date.month = "December"
    println("Dari ${date.month} ke Juni masih ${date.monthsUntilSummerBreak()} bulan lagi")
    fun Int.abs(): Int {
        return if(this < 0) -this else this
    }
    println(4.abs())
    println(-4.abs())
    // Tambahan: test factorial
    println("Faktorial dari 5 adalah: ${MyMath.factorial(5)}")
}
