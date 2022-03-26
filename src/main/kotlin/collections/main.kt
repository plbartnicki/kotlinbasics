package collections

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.LinkedHashSet

fun main() {
    //Listy (array listy, linked listy), Zbior, Map / slownik (zbior par (klucz, warosc), kolejka, stos
    val list1 = ArrayList<String>()   //   h,  ala, kasia, abc, xyz   O(n)
    val list2 = LinkedList<String>()  // h -> ala -> kasia -> abc -> xyz O(1)
    //poczytac o zlozonosciach pozostalych operacji

    val hashSet = HashSet<Int>()  //
    hashSet.add("12".toInt())
    hashSet.add(12)

    //hashCode nie jest roznowartosciowe

    println(hashSet.size)

    val set1 = setOf(1,2,3) - setOf(2)
    println(set1)
    //set (hashSet) = { 101, 100 }
    //101 100

    val linkedHashSet = LinkedHashSet<Int>()
    for(i in 1.. 100) {
        linkedHashSet.add(i)
    }

    linkedHashSet.forEach{print("${it} ")}

    //wszystkie kolekcje oparte na haszowaniu gwarantuja nam ze dodawanie wartosci oraz sprawdzanie czy wartosc istnieje maja zlonosc O(1)
    // 32  434   67  //hashcode
    // v1 v2  "kasia"
    //        "basia"  //equals

    println(set1.contains(3))

    val map = HashMap<String, Int>()   //(klucz: String, wartosc: Int)    ("dog", "pies")
    map.put("one", 1)
    map.put("two", 2)
    map.put("one", 111)

    println(map)

    val map2 = mapOf("one" to 1 , "two" to 2) //to jest immutable
    //abc xyz abc test

    println(map2)

    //LinkedHashMap zapoewnia ze kolejnsc iteracji bedzie taka sama jak kolejnosc wstawiania

    val randNum = (1..100).random()
    println("\n" + randNum)

}