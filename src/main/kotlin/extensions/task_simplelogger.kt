package extensions

import java.util.*

class SimpleLogger {
    fun log(message: String) {
        println("${Calendar.getInstance().time} ---- $message")
    }
}

fun main() {
    val simpleLogger = SimpleLogger()
    simpleLogger.log("Connection to database has been interrupted")

    fun SimpleLogger.surroundedLog(message : String) {
        fun separator(n : Int) {
//            for(i in 1 .. n) {
//                print("-")
//            }
            print("-".repeat(n))
        }
        val messageLength = message.length
        separator(messageLength)
        println("\n" + message)
        separator(messageLength)
    }

    simpleLogger.surroundedLog("Connection to database has been interrupted")
}