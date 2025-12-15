package Antrian

interface Queue<T> {
    fun enqueue(element: T): Boolean
    fun dequeue(): T?
    fun peek(): T?
    val count: Int
    val isEmpty: Boolean
        get() = count === 0
}

class ArrayListQueue<T>: Queue<T> {
    private val list = arrayListOf<T>()
    override fun enqueue(element: T): Boolean {
        return list.add(element)
    }

    override fun dequeue(): T? = if (isEmpty) null else list.removeAt(0)

    override fun peek(): T? = list.getOrNull(0)

    override val count: Int
        get() = list.size

}