package companionobject

//odpowiednik singltona
object SimpleLogger {
    fun logInfo(message: String) {
        println(" INFO $message");
    }

    fun logError(message: String) {
        println(" ERROR $message");
    }
}