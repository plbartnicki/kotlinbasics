package companionobject

import org.junit.Assert.*
import org.junit.Test

class MathHelperTest {
    @Test
    fun testMaxDiv() {
        //given
        val testVal = 27

        //when
        val result = MathHelper.maxDiv(testVal)
        assertEquals(9,result )
    }
}