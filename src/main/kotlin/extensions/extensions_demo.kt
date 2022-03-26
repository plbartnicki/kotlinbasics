package extensions

class Rectangle(val a: Double, val b : Double) {
    fun area() : Double {
        return a * b
    }
}

fun main() {
    fun Rectangle.perimeter(): Double {
        return 2*(a + b)
    }

    //to nie jest override
    fun Rectangle.area() : Double {
        return 1.0
    }

    val rectangle1  = Rectangle(3.0, 2.0)
    println("Area of the rectangle is ${rectangle1.area()}")
    println("Perimeter of the rectangle is ${rectangle1.perimeter()}")

    fun String.evenLength() : Boolean {
        return this.length % 2 == 0
    }

    println("test".evenLength())
}