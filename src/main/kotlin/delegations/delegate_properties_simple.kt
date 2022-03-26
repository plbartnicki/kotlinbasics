package delegations

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class UnsafeAccount(val id: Int) {
    var updateCount = 0

    var toPay: Double = 0.0
        set(value) {
            field = value
            updateCount++
        }
        get() = field

    var debt: Double = 0.0
        set(value) {
            field = value
            updateCount++
        }
        get() = field
}

class SaferAccount(val id: Int) {
    var updateCount = 0

    var toPay: Double = 0.0
        set(value) {
            if(value > 0) {
                field = value
                updateCount++
                //f()
            }
        }
        get() = field

    var debt: Double = 0.0
        set(value) {
            if(value > 0) {
                field = value
                updateCount++
                //f()
            }
        }
        get() = field
}



class B {

}

