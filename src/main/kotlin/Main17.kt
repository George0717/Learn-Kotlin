// Fungsi utama (Testing)
fun main() {

    "Contoh menggunakan Stack" example {
        val stack = StackImpl<Int>().apply {
            push(1)
            push(10)
            push(100)
            push(1000)
            push(10000)
        }
        print(stack)
        val poppedElement = stack.pop()
        if(poppedElement != null) {
            println("Popped: $poppedElement")
        }
        print(stack)

        println("Stack kosong? ${stack.isEmpty()}")

        stack.push(10)
        stack.push(20)
        stack.push(30)

        println("Elemen teratas: ${stack.peek()}")
        println("Jumlah elemen: ${stack.size()}")

        println("Pop: ${stack.pop()}")
        println("Pop: ${stack.pop()}")

        println("Elemen teratas sekarang: ${stack.peek()}")
        println("Jumlah elemen sekarang: ${stack.size()}")

        stack.clear()
        println("Stack kosong setelah clear? ${stack.isEmpty()}")
    }

    "Inisilaisasi stack dari sebuah list" example {
        val list = listOf("A", "B", "C", "D")
        val stack = StackImpl.create(list)
        print(stack)
        println("Popped: ${stack.pop()}")
        println(stack)
    }

    "Inisilaisasi stack dari sebuah Array" example {
        val stack = stackOf(1.0, 2.0, 3.0, 4.0)
        print(stack)
        println("Popped: ${stack.pop()}")
        println(stack)
    }



}