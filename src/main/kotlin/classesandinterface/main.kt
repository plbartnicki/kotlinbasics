package classesandinterface

import entities.*

//class A

fun main() {
    val p1 = Point3D(-0.1, 2.3, 5.0)
    val p2 = Point3D(-0.1, 2.3, 5.0)

    //uzyj equals
    println(p1.equals(p2))

    println(p1.x)

    Customer("Kasia", nationality = "Spanish").logData()

    val box1 = Box("test", 11)
    println(box1)
    box1.resetAllData()
    println(box1)

    val vehicles: List<Vehicle> = listOf(
        MotorBike("SuperBike", 150),
        Car("Toyota", 200), MotorBike("SuperBike", 150)
    )

    println()

    fun(vehicle : Vehicle) {
        vehicle.run()
    }

    val vehicleManager = VehicleManagerImpl()
    vehicleManager.addVehicle(MotorBike("SuperBike", 150))
    vehicleManager.addVehicle(MotorBike("SuperBike", 150))
    vehicleManager.addVehicle(MotorBike("Toyota", 200))
    println(vehicleManager.getBrands())

    val pl1 = Player("Ala", true)
    val pl2 = Player("Ala", true)
    //pl2.name = "Basia"
    pl2.active = false
    println(pl1.equals(pl2))
    println(pl1)

    //w kotlinie klasy defaultowa sa final a gdy chcemy inaczej, trzeba uzyc open
    open class A constructor(a: Int, b:String?) {
        public fun f() {

        }
    }

    class B(a: Int, b:String?, c:String) : A(a, b)

    //modyfikatory dostepu
    open class C {
        val name = "test"
        private val number = 1
        internal val x = 'a' //skladowa x jest dostepna w obszarze tego samego modulu (modul to jest zbior skompilowanych zrodel)

        protected open fun f() { //zeby f mogla zostac nadpisana to musi byc open

        }
    }

    class D : C() {
        override fun f() {

        }
    }

}