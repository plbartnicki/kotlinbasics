package classesandinterface

import entities.Point3D

//class A

fun main() {
    val p1 = Point3D(-0.1, 2.3, 5.0)
    val p2 = Point3D(-0.1, 2.3, 5.0)

    //uzyj equals
    println(p1.equals(p2))

    println(p1.x)

    Customer("Kasia", nationality = "Spanish").logData()
}