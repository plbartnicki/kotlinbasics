package companionobject

import junit.framework.Assert.assertEquals
import org.junit.Test

class ListHelperTest {
    @Test
    fun shouldIsDuplicate() {
        // given
        val wordList = listOf<String>("asercja", "aksjomat", "asercja")

        // when
        val result = TaskListHelper.containsDuplicate(wordList)

        // then
        assertEquals(true, result)
    }
}