package delegations

import org.junit.Test
import kotlin.test.assertEquals

/*
    powinnismy przetesowac wszystkie publiczne metody klasy SafeAccountWithPropertyDelegate
 */
class SafeAccountWithPropertyDelegateTest {

    @Test
    fun testToPayWithSuccess() {
        //given
        val a2 = SafeAccountWithPropertyDelegate(2)

        //when
        a2.toPay = 1.0

        //then
        assertEquals(1.0, a2.toPay)
    }

    @Test
    fun testToPayWithFailed() {
        //given
        val a2 = SafeAccountWithPropertyDelegate(2)

        //when
        a2.toPay = -1.0

        //then
        assertEquals(0.0, a2.toPay)
    }
}