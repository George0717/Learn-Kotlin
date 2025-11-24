package Tugas3

interface Shape {
    fun calculateArea(): Double
    fun calculatePerimeter(): Double
}

class Circle(private val radius: Double) : Shape {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }
}

fun main() {
    val circle = Circle(7.0)
    println("Luas lingkaran: ${"%.2f".format(circle.calculateArea())}")
    println("Keliling lingkaran: ${"%.2f".format(circle.calculatePerimeter())}")
}
