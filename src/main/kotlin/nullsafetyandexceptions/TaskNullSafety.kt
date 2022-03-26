package nullsafetyandexceptions

class TaskNullSafety {
    companion object{
        fun theSameLenghtAndNotNull(word1: String?, word2: String?) : Boolean {
            return word1?.length == word2?.length ?: false
        }
    }
}