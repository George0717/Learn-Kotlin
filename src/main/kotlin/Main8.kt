import jdk.dynalink.Operation

fun main(){
// Lambda
    var multiplyLambda: (Int, Int) -> Int // Deklarasi Variabel
    multiplyLambda = {a: Int, b: Int -> Int // Menetapkan lambda ke var
        a * b
    }

    val lambdaResult = multiplyLambda(4,2)
    println(lambdaResult) // 8

//    Short Hand syntax
    multiplyLambda = {a, b -> a * b}

//    it keyword
    var doubleLambda = {a: Int -> 2 * a}
    doubleLambda = { 2 * it}
    var square: (Int) -> Int = {it * it}

//    Lambda as argumen
fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    val result = operation(a,b)
    return result
}
    val addLambda = {a: Int, b: Int -> a+ b}
    println(operateOnNumbers(4, 2,addLambda)) // 6

    fun addFunction(a: Int, b: Int) = a + b
    println(operateOnNumbers(4,2, ::addFunction)) // 6
    println(operateOnNumbers(4,2, operation = {a: Int, b: Int -> a + b})) // 6
    println(operateOnNumbers(4,2, {a, b -> a + b})) // 6
    println(operateOnNumbers(4,2, operation = Int::plus)) // 6
    println(operateOnNumbers(4,2) {a, b -> a + b}) // 6

//    Lambda with no meaningful return value
    var unitLambda: () -> Unit = {
        println("Ini hanya contoh")
    }
    unitLambda()

    var nothingLmbda: () -> Nothing = {
        throw NullPointerException()
    }
//    capturing from the enclosing scope
fun countingLambda(): () -> Int {

    var counter = 0
    var incrementCounter = {
        counter += 1
        counter
    }
    return incrementCounter
}

    val counter1 = countingLambda()
    val counter2 = countingLambda()
    println(counter1)
    println(counter2)
    println(counter1)
    println(counter2)
    println(counter1)
    println(counter2)

    val names = arrayOf("ZZZZ", "BB", "ASADAD", "DSDASD", "DSDSAFDSF")
    names.sorted()

    val namesByLength = names.sortedWith(compareBy {
        -it.length // tanda minus menyebabkan pengurutan menurun menurut panjanganya
    })
    println(namesByLength)

    val values = listOf(1,2,3,4,5,6)
    values.forEach {
        println("$it: ${it * it}")
    }

    var prices = listOf(1.5,2.5,9.5, 10.4)
    val largePrices = prices.filter {
        it > 5.0
    }
    println(largePrices)

    val salePrices = prices.map {
        it * 8.9
    }
    println(salePrices)
}
