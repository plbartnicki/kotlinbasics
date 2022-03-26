package delegations

import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.LinkedHashSet

interface DateTimeGenerator {
    fun generateDate() : String
    fun generateTime() : String
}

class StandardDateTimeGenerator(val messagePrefix: String) : DateTimeGenerator {
    override fun generateDate(): String {
        val simpleDateFormat = SimpleDateFormat("dd-MM-yyyy")
        val curretDate = simpleDateFormat.format(Date())
        return "${messagePrefix} ${curretDate}"
    }

    override fun generateTime(): String {
        val simpleDateFormat = SimpleDateFormat("HH:mm:ss")
        val curretTime = simpleDateFormat.format(Date())
        return "${messagePrefix} ${curretTime}"
    }
}

class BasicDateTimeGenerator(dateTimeGenerator: DateTimeGenerator) : DateTimeGenerator by dateTimeGenerator {
    override fun generateDate(): String {
        val simpleDateFormat = SimpleDateFormat("dd-MM-yyyy")
        val curretDate = simpleDateFormat.format(Date())
        return curretDate
    }
}

fun main() {
    val standardDateGenerator = StandardDateTimeGenerator("Current time: ")
    println(standardDateGenerator.generateDate())

    val basicDateTimeGenerator = BasicDateTimeGenerator(standardDateGenerator)
    println(basicDateTimeGenerator.generateDate())

    fun divideBy0(a: Double, b: Double): Double {
        if(b == null || b.equals(0.0)) {
            throw Exception("invalid value of the second argument")
        }

        return a.div(b)
    }

    try {
        println(divideBy0(2.0, 0.0))
    } catch (ex : Exception) {
        println(ex.message)
    }

    println("app is running")

    //Thomas Cormen - Wprowadzenie do Algorytmow

}