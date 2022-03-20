package arraysandloops

/*
     a % b należy do zbioru <0, b-1>
     7 = 2*3 + 1  //1 - reszta z dzielenia 7 przez 3 i przez 2
 */

/* Ta funkcja dla podanej liczby całkowitej zwraca ilość zer na końcu liczby */
// f(100) -> n = 1 k=2
fun numOfZero(arg: Int): Int {
    var k = 0
    var n = arg
    while (n % 10 == 0) {
        n /= 10    //n = n / 10
        k++
    }
    return k
}

fun digitSum(arg: Int): Int {
    var sum = 0
    var n = Math.abs(arg)
    while (n > 0) {
        sum += n % 10
        n /= 10
    }
    return sum
}

fun prepareSequence(n: Int): Array<String?> {
    val array = arrayOfNulls<String>(n) //to nie jest immutable
    for (i in 0..n - 1) {
        array[i] = "word" + i
    }
    return array
}

fun maxNumDivBy5(values: Array<Int>): Int? {
    if (values.isEmpty()) {
        return null
    }

    var candiate: Int? = null //kandydat na max
    for (v in values) {
        if (v % 5 == 0) {
            if (candiate == null || v > candiate) {
                candiate = v  //za candidate podstawiam nowa wieksza wartosc podzielna przez 5
            }
        }
    }
    return candiate
}

//a < b
fun concat(nums : List<String>, a: Int, b : Int) : String {
    return nums.filter{ el -> el.length >= a && el.length <= b}.reduce{a, b-> b + a}
}

fun main(args: Array<String>) {

    //funkcje można zagnieżdżać
    /*  fun f() {
          fun g() {

          }
      } */

    if (!args.isEmpty()) {
        println(args[0])
    }

    for (i in 10..20) {
        print("$i ")
    }
    println()
    for (i in 10 downTo 2 step 2)
        print("$i ")

    println()
    println(numOfZero(3221000));
    println(numOfZero(101));

    println(digitSum(-123))
    println(digitSum(10201))
    println(digitSum(7))

    val array1 = arrayOf(12, 31, 14, 51, 16, 71) //arrayOf zwraca nam immutable array (nie mozna dodac wartosci)

    var sum = 0
    for (v in array1) {
        sum += v
    }

    println(sum)

    //println(prepareSequence(15))
    for (v in prepareSequence(15)) {
        print(v + " ")
    }

    println("\n" + maxNumDivBy5(arrayOf(150, -51, 24, 101, 105)))
    println("\n" + maxNumDivBy5(arrayOf(-150, -51, -24, -5, -105)))
    println("\n" + maxNumDivBy5(arrayOf(25)))
    println("\n" + maxNumDivBy5(arrayOf()))

    //listy
    var immutableList = listOf<String>("abcde", "abc", "xyzv")
    println(immutableList.toString())
    //immutableList.add
   // immutableList = listOf<String>("Word", "Word2", "Word3")

    val mutableList = mutableListOf<Double>(1.0, -9.0, -0.01)
    mutableList.add(10.01)
    //mutableList.set(1, 0.01)

    println()
    //chcemy przygotowac liste z wartosciami z listy immutableList ale od konca i o dlugosci >= 4
    //"abcde", "abc", "xyzv" -> "edcba", "vzyx"

    val resultlist = immutableList.filter { it -> it.length >= 4 }.map { it.reversed() }
    println(resultlist)

    val numbers = IntArray(10) {3*it}
    numbers.forEach { it -> println(it)  }

    fun sumValuesLess0(nums: List<Double>):Double {
        return nums.filter{it -> it < 0}.reduce { acc, d -> acc + d}
    }

    println(sumValuesLess0(mutableList))

    println(concat(listOf("ala", "mars", "topologia"), 2, 4))
}