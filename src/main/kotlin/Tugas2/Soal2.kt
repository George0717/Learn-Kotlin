package Tugas2

fun printLongStateNames(states: Map<String, String>) {
    for ((code, name) in states) {
        if (name.length > 8) println(name)
    }
}

fun main() {
    val states = mapOf(
        "NY" to "New York",
        "CA" to "California",
        "TX" to "Texas",
        "MA" to "Massachusetts"
    )

    printLongStateNames(states)
}
