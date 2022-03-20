package entities

class Car( brand: String, val maxSpeed: Int, val color: Color = Color.BLUE ) : Vehicle(brand) {
    override fun run() {
        println("Car started")
    }

    override fun stop() {
        println("Car stopped")
    }
}