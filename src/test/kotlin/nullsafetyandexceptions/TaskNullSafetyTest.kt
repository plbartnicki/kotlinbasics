package nullsafetyandexceptions

import org.junit.Assert.*
import org.junit.Test

class TaskNullSafetyTest {
    @Test
    fun testTheSameLenghtAndNotNullWithBothNullArgs() {
        assertFalse(TaskNullSafety.theSameLenghtAndNotNull(null, null))
    }

    @Test
    fun testTheSameLenghtAndNotNullWithBothNotNullArgsWithTheSameSize() {
        assertTrue(TaskNullSafety.theSameLenghtAndNotNull("abc", "abc"))
    }

    @Test
    fun testTheSameLenghtAndNotNullWithBothNotNullArgsWithDifferentSize() {
        assertFalse(TaskNullSafety.theSameLenghtAndNotNull("abc", "abcx"))
    }


    @Test
    fun testTheSameLenghtAndNotNullWithBothNotNullArgsWithOnlyFirstNull() {
        assertFalse(TaskNullSafety.theSameLenghtAndNotNull(null, "abc"))
    }

    @Test
    fun testTheSameLenghtAndNotNullWithBothNotNullArgsWithOnlySecondNull() {
        assertFalse(TaskNullSafety.theSameLenghtAndNotNull("abc", null))
    }
}