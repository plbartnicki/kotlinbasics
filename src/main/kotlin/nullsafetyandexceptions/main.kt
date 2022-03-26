package nullsafetyandexceptions

import java.lang.Exception
import java.lang.NullPointerException

fun main() {
    var number: Double? = -0.00001
    number = null

    var number2: Int? = null
    //   number2 = 10

    try {
        number2!!.equals(0.01)
        //tutaj moze poleciec wyjatek
    } catch (ex: Exception) {
        //najczesciej tutaj sie zapisuje komunikat do pliku z logiem

       // println(ex)
       // ex.printStackTrace()
       // throw ex
    }

    val result = if (number2 != null) number2.equals(10) else false

    val name = "Zosia"
    val resul2 = "Zosia".equals(name)

    print(result)

    number2 = 10
    val result3 = number2?.equals(10) ?: false
    println(result3)

    val names: List<String?> = listOf("abc", null, "xyz")
    for(name in names) {
        name?.let { println(it) }   //zostanie wydrukowane wszystko co nie jest nullem
    }

    data class Employee(var name: String, var salary: Double)
    var emp1 = Employee("Asia", 200000.0)
    emp1.apply { this.salary = 3000000.0 } //w przeciwienstwie do let, apply, zwroci obiekt klasy Employee
    println(emp1)

    try {
        println(h(-9.0))
    } catch (ex: NullPointerException) {
        //akcja 1
        println(ex)
        return
    } catch (ex: NotPositiveValueException) {
        ex.printStackTrace()
        throw ex
    } finally {
        println("cleaning data")
    }

    println("app is running")
}

fun h(x: Double?): Double {
    if(x!! <= 0.0) {
        throw NotPositiveValueException()
    }
    return Math.log(x!!) * Math.E + Math.PI
}

fun notCompleted(): Nothing {
    throw Exception("no completed implementation")
    //numer taska w jirz
}