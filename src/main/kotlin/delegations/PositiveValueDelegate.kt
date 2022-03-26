package delegations

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class PositiveValueDelegate: ReadWriteProperty<Any?, Double> {
    private var positiveValue: Double = 0.0

    override fun getValue(thisRef: Any?, //referencja na obiekt klasy, ktorej dotyczy propercja
                          property: KProperty<*>
    ): Double {
        return positiveValue
    }

    override fun setValue(thisRef: Any?,
                          property: KProperty<*>,
                          value: Double) {
        if(thisRef is SafeAccountWithPropertyDelegate) {
            if(value > 0) {
                positiveValue = value
                thisRef.updateCount++
            }
        }
    }
}