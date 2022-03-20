package classesandinterface

import entities.Vehicle

interface VehicleManager {
    fun addVehicle(v: Vehicle)
    fun getBrands(): Set<String>
}