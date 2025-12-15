infix fun String.example(function: () -> Unit) {
    println("--example of $this")
    function()
    println()
}

fun <T> stackOf(vararg elements: T): StackImpl<T> {
    val stack = StackImpl<T>()
    for (element in elements) {
        stack.push(element)
    }
    return stack
}