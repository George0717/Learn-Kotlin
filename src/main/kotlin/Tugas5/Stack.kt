package Tugas5

class Stack<T> {

    private val elements = mutableListOf<T>()

    fun push(item: T) {
        elements.add(item)
    }

    fun pop(): T? {
        return if (isEmpty()) {
            null
        } else {
            elements.removeAt(elements.size - 1)
        }
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}


fun main() {
    val stack = Stack<Int>()

    stack.push(10)
    stack.push(20)
    stack.push(30)

    println(stack.pop()) // 30
    println(stack.isEmpty()) // false
}
