import java.util.Calendar

// =========================
// ENUM HARI
// =========================
enum class DayOfTheWeek(val isWeekend: Boolean = false) {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday(true),
    Sunday(true);

    fun daysUntil(other: DayOfTheWeek): Int {
        return if (this.ordinal < other.ordinal) {
            other.ordinal - this.ordinal
        } else {
            other.ordinal - this.ordinal + entries.count()
        }
    }

    companion object {
        fun today(): DayOfTheWeek {
            val calendarDayOfTheWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
            var adjustedDay = calendarDayOfTheWeek - 2
            val days = DayOfTheWeek.entries
            if (adjustedDay < 0) {
                adjustedDay += days.count()
            }
            return days.first { it.ordinal == adjustedDay }
        }
    }
}

// =========================
// SEALED CLASS CURRENCY
// =========================
sealed class AcceptedCurrency(
    val code: String,
    val fullName: String,
    val toIDR: Double
) {
    // --- Mata uang resmi ---
    sealed class FiatCurrency(code: String, fullName: String, toIDR: Double) :
        AcceptedCurrency(code, fullName, toIDR) {
        object USD : FiatCurrency("USD", "United States Dollar", 16000.0)
        object EUR : FiatCurrency("EUR", "Euro", 17500.0)
        object JPY : FiatCurrency("JPY", "Japanese Yen", 110.0)
        object GBP : FiatCurrency("GBP", "British Pound Sterling", 20000.0)
        object IDR : FiatCurrency("IDR", "Indonesian Rupiah", 1.0)
        object AUD : FiatCurrency("AUD", "Australian Dollar", 10500.0)
        object CAD : FiatCurrency("CAD", "Canadian Dollar", 12000.0)
        object CHF : FiatCurrency("CHF", "Swiss Franc", 18500.0)
        object CNY : FiatCurrency("CNY", "Chinese Yuan", 2300.0)
        object KRW : FiatCurrency("KRW", "South Korean Won", 12.0)
    }

    // --- Cryptocurrency ---
    sealed class CryptoCurrency(code: String, fullName: String, toIDR: Double) :
        AcceptedCurrency(code, fullName, toIDR) {
        object BTC : CryptoCurrency("BTC", "Bitcoin", 105_000_0000.0)
        object ETH : CryptoCurrency("ETH", "Ethereum", 60_000_000.0)
        object BNB : CryptoCurrency("BNB", "Binance Coin", 9_000_000.0)
        object DOGE : CryptoCurrency("DOGE", "Dogecoin", 2_000.0)
        object SOL : CryptoCurrency("SOL", "Solana", 2_500_000.0)
    }

    companion object {
        val all = listOf(
            // Fiat
            FiatCurrency.USD, FiatCurrency.EUR, FiatCurrency.JPY, FiatCurrency.GBP, FiatCurrency.IDR,
            FiatCurrency.AUD, FiatCurrency.CAD, FiatCurrency.CHF, FiatCurrency.CNY, FiatCurrency.KRW,
            // Crypto
            CryptoCurrency.BTC, CryptoCurrency.ETH, CryptoCurrency.BNB, CryptoCurrency.DOGE, CryptoCurrency.SOL
        )
    }
}

// =========================
// MAIN PROGRAM
// =========================
fun main() {
    // === Bagian Hari ===
    for (day in DayOfTheWeek.entries) {
        val status = if (day.isWeekend) "Weekend" else "Hari kerja"
        println("Day ${day.ordinal}: ${day.name}, status: $status")
    }

    val today = DayOfTheWeek.today()
    val isWeekend = "It is ${if (today.isWeekend) "" else "not"} the weekend"
    val daysUntilFriday = today.daysUntil(DayOfTheWeek.Friday)
    println("\nIt is $today. $isWeekend. There are $daysUntilFriday days until Friday")

    when (today) {
        DayOfTheWeek.Friday -> println("It's $today, I'm in love")
        else -> println("It's $today, I'm busy")
    }

    // === Bagian Mata Uang ===
    println("\n=== Daftar Mata Uang yang Diterima ===")
    for (currency in AcceptedCurrency.all) {
        val type = when (currency) {
            is AcceptedCurrency.FiatCurrency -> "Fiat"
            is AcceptedCurrency.CryptoCurrency -> "Crypto"
        }
        println("${currency.code} - ${currency.fullName} | Tipe: $type | 1 ${currency.code} = ${currency.toIDR} IDR")
    }
}
