fun main() {
    // ============================
    // Pair
    // ============================
    val coordinate = Pair(2, 3)
    println("Pair: $coordinate")
    println("First value: ${coordinate.first}")
    println("Second value: ${coordinate.second}")

    // Destructuring Pair
    val (x, y) = coordinate
    println("Destructured: x = $x, y = $y")

    // Copy Pair (immutable, jadi buat baru)
    val newCoordinate = coordinate.copy(first = 5)
    println("New Pair (copy): $newCoordinate")

    // ============================
    // Boolean & Comparison
    // ============================
    val yes = true
    val no = false
    println("yes = $yes")
    println("no = $no")

    val doesOneEqualTwo = (1 == 2)
    val doesOneNotEqualTwo = (1 != 2)
    val isOneGreaterThanTwo = (1 > 2)
    val isOneLessThanTwo = (1 < 2)
    val isOneGreaterOrEqualTwo = (1 >= 2)
    val isOneLessOrEqualTwo = (1 <= 2)

    println("1 == 2 -> $doesOneEqualTwo")
    println("1 != 2 -> $doesOneNotEqualTwo")
    println("1 > 2 -> $isOneGreaterThanTwo")
    println("1 < 2 -> $isOneLessThanTwo")
    println("1 >= 2 -> $isOneGreaterOrEqualTwo")
    println("1 <= 2 -> $isOneLessOrEqualTwo")

    val andExample = yes && no
    val orExample = yes || no
    val notExample = !yes

    println("true && false -> $andExample")
    println("true || false -> $orExample")
    println("!true -> $notExample")

    val complexLogic = (1 < 2) && (2 < 3) || !(4 == 4)
    println("Complex Logic Result: $complexLogic")

    // ============================
    // String Equality
    // ============================
    val str1 = "Hello"
    val str2 = "Hello"
    val str3 = String("Hello".toCharArray())
    val str4 = "HELLO"

    println("str1 == str2 -> ${str1 == str2}")   // true
    println("str1 === str2 -> ${str1 === str2}") // bisa true (interned)
    println("str1 == str3 -> ${str1 == str3}")   // true
    println("str1 === str3 -> ${str1 === str3}") // false
    println("str1.equals(str4, ignoreCase = true) -> ${str1.equals(str4, ignoreCase = true)}")

    // ============================
    // If Expression
    // ============================
    val number = 10
    if (number > 0) {
        println("$number is positive")
    } else if (number == 0) {
        println("Number is zero")
    } else {
        println("$number is negative")
    }

    // If sebagai expression (langsung menghasilkan nilai)
    val result = if (number % 2 == 0) "Even" else "Odd"
    println("Result from if-expression: $result")

    // ============================
    // Looping
    // ============================

    // For loop dengan range
    println("For loop (1..5):")
    for (i in 1..5) {
        print("$i ")
    }
    println()

    // For loop dengan step
    println("For loop with step:")
    for (i in 0..10 step 2) {
        print("$i ")
    }
    println()

    // For loop menurun
    println("For loop downTo:")
    for (i in 5 downTo 1) {
        print("$i ")
    }
    println()

    // While loop
    println("While loop:")
    var count = 0
    while (count < 3) {
        println("Count = $count")
        count++
    }

    // Do-while loop
    println("Do-while loop:")
    var index = 0
    do {
        println("Index = $index")
        index++
    } while (index < 3)


}
