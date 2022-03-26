package delegations

import kotlin.properties.Delegates

class Box(name: String, n: Int) {
    val name = name
        get() = field

    var n = n
        get() = field
        set(value) {
            field = value
        }

    //cacheowanie

    val specialValue: Double by lazy {  //1/1! + 1/2! + ... 1/m!
        println("computing has been started")
        var result = 0.0
        var fact = 1;
        for(i in 1..n) {
            fact *= i
            result +=  1/fact.toDouble()
        }

        result
    }

    var information : String by Delegates.observable("[no info]") {
        p, old, new ->
        println("Sending email has been started")
        println("Email message: ${p.name} has been updated from $old to $new")
        println("Sending email has been completed")
    }
}

fun main() {
    val b1 = Box("box1", 10)
    println(b1.n)
    b1.n = 3
//    b1.name = "abc"

    println(b1.specialValue)
    println(b1.specialValue)  //ta wartosci pochodzi z cache (czyli nie nastapi ponowne liczenie wg wzoru)

    //observable demo
    println(b1.information)
    b1.information = "this box contains important value"

}