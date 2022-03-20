package entities

class MotorBike( brand: String, val maxSpeed: Int, val color: Color = Color.BLUE ) : Vehicle(brand) {
    override fun run() {
        println("Motor started")
    }

    override fun stop() {
        println("Motor stopped")
    }
}