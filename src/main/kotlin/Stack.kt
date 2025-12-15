// ===============================
// Stack Lengkap dalam 1 File
// ===============================

// Interface Stack
interface Stack<T> {
    fun push(item: T)
    fun pop(): T
    fun peek(): T
    fun isEmpty(): Boolean
    fun size(): Int
    fun clear()
}

// Custom Exception untuk Stack Kosong
class EmptyStackException(message: String) : RuntimeException(message)

// Implementasi Stack
class StackImpl<T> : Stack<T> {

    companion object {
        fun <T> create(items: Iterable<T>) :Stack<T> {
            val stack = StackImpl<T>()
            for (item in items){
                stack.push(item)
            }
            return stack
        }
    }

    fun <T> stackOf(vararg elements: T): Stack<T> {
        return StackImpl.create(elements.asList())
    }

    // Struktur data utama stack
    private val storage = arrayListOf<T>()

    // Menambahkan elemen ke atas stack
    override fun push(item: T) {
        storage.add(item)
    }

    // Menghapus dan mengembalikan elemen teratas
    override fun pop(): T {
        if (isEmpty()) {
            throw EmptyStackException("Stack kosong, operasi pop tidak dapat dilakukan")
        }
        return storage.removeAt(storage.size - 1)
    }

    // Mengambil elemen teratas tanpa menghapus
    override fun peek(): T {
        if (isEmpty()) {
            throw EmptyStackException("Stack kosong, operasi peek tidak dapat dilakukan")
        }
        return storage.last()
    }

    // Mengecek apakah stack kosong
    override fun isEmpty(): Boolean {
        return storage.isEmpty()
    }

    // Mengembalikan jumlah elemen stack
    override fun size(): Int {
        return storage.size
    }

    // Menghapus seluruh isi stack
    override fun clear() {
        storage.clear()
    }

    // Representasi Stack dari TOP ke BOTTOM
    override fun toString() = buildString {
        appendLine("--TOP--")
        storage.asReversed().forEach {
            appendLine(it.toString())
        }
        appendLine("--------")
    }
}
