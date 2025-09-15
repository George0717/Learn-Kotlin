import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sin
import kotlin.math.sqrt

fun main() {
    println("Hello")
    println(1)
    println(true)
    println(2.0)
    println(2 * 5 / 3)
    println(5 % 10 + 5)
    println(5.10 % 27.5 + 5)
    println(25.0 % 100)
    println("%.0f".format(28.08 % 99.01))
    println("%.5f".format(27.91 % 5.01))
    println("%.4f".format(21.08 % 7.01))

    println(1 shl 3) // shl (left)
    println(32 shr 2) // shr (right)
    println(((8000 / (5*10)) - 32) shr (29 % 5))
    println((7968 / (5 % 8.2)) + 7 * 5)
    println(sin(x = 45 * 7.5))
    println(cos(x = 45 * 7.5))
    println(sqrt(x = 45 * 7.5))
    println(min(a = 1 ,b =  7))
    println(max(a = 1 ,b = 7))
    println(max(a = sqrt(x = 7.90), b = PI / 2) )

//    Val = Value
    val text: String = "Hello\n"
    print(text)
    val number: Int = 15
    val pi: Double = 3.141412
    println(number)
    println(pi)

//    Variables
    var x: Int = 42
    println(x)
    x = 1_000_000 * 3_000
    print(x)

//    Meaningful Names -> nama variabel yang tidak boleh sembarangan
//    1. Good Meaningful Names
//    personAge
//    numberOfPeople
//    grade
//    2. Bad Meaningful Names
//    a
//    temp
//    average

//    Increment dan Decrement
    var counter: Int = 0
    counter += 1 // sama saja dengan counter = counter + 1
    println(counter)
    counter -= 4 // sama saja dengan counter = counter - 1
    println(counter)
    counter /= 8
    println(counter)
    counter *= 7

//    ani membeli 7 buku, tiap buku harganya Rp.50.000. Toko memberi dikson 15%. Buatlah program kotlin untuk menghitung total harga yang harus dibayar ani
  val buku: Int = 7
  val subTotal: Int = buku * 50000
  val diskon: Double = subTotal * 0.15
  val totalHarga: Double = subTotal - diskon
    println("Jumlah Bayar : $totalHarga")

//



}
