package delegations

import java.lang.Exception
import java.lang.IllegalArgumentException
import java.util.*
import kotlin.collections.HashSet

interface RandGenerator {
    fun rand(amount : Int, min: Int, max: Int) : List<Int>
}

//SOLID, DRY, wzorce projektowe (design patterns)

class MainRandGenerator : RandGenerator {
    override fun rand(amount: Int, min: Int, max: Int): List<Int> {
        if(amount < 0 || min > max) {
            throw IllegalArgumentException("Wrong argument[s]")
        }

        val numbers = LinkedList<Int>()
        for(i in 1 ..amount) {
            numbers.add(0, (min..max).random())
        }

        return numbers
    }
}

//amount = 10   min = 1  max = 3
class SpecialRandGenerator(val randGenerator: RandGenerator) : RandGenerator by randGenerator {
    override fun rand(amount: Int, min: Int, max: Int): List<Int> {
        if(amount < 0 || min > max || amount > max - min + 1) {
            throw IllegalArgumentException("Wrong argument[s]")
        }

        val numbers = HashSet<Int>()
        while(numbers.size < amount ) {
            var r = (min..max).random()
//            if(!numbers.contains(r)) {
                numbers.add(r)
//            }
        }

        return numbers.toList()  //O(n)         O(n^2) + O(n) = O(n^2)
    }

}

fun main() {
    val mainRandGenerator = MainRandGenerator()
    val speciaRandGenerator = SpecialRandGenerator(mainRandGenerator)
    try {
        println(mainRandGenerator.rand(10, 1, 10))
        println(speciaRandGenerator.rand(10, 10, 100))
    } catch (ex : Exception) {
        println(ex)
    }
}