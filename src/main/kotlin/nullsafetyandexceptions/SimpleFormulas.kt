package nullsafetyandexceptions

class SimpleFormulas {
    companion object {
        fun h(x: Double?): Double {
            if(x!! <= 0.0) {
                throw NotPositiveValueException()
            }
            return Math.log(x!!) * Math.E + Math.PI
        }
    }
}