package nullsafetyandexceptions

import org.junit.Assert.*
import org.junit.Test

class SimpleFormulasTest {
    @Test
    fun testHThrowsNotPositiveValueException() {
        var throwEx = false
        try {
            SimpleFormulas.h(-1.0)
        } catch (ex: NotPositiveValueException) {
            throwEx = true
        }

        assertTrue(throwEx)
    }
}