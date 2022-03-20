package classesandinterface

import entities.Vehicle

class VehicleManagerImpl : VehicleManager {
    private val vehicles = mutableListOf<Vehicle>()

    override fun addVehicle(v: Vehicle) {
        vehicles.add(v)
    }

    override fun getBrands(): Set<String> {
//        val brands = mutableSetOf<String>()
//        for(v in vehicles) {
//            brands.add(v.brand)
//        }
//
//        return brands

        return vehicles.map{it -> it.brand}.toHashSet()
    }
}