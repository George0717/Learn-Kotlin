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
}
