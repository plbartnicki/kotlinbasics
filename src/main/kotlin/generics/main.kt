package generics

class AbstractTrio<A, B, C>(val value1: A, val value2: B, val value3: C) {
    override fun toString(): String {
        return "AbstractTrio(value1=$value1, value2=$value2, value3=$value3)"
    }
}

interface Producer<out T> {  //jesli jest out to T moze byc jedynie typem zwracanym
    fun produce(): T
}

//A<out T> to w Javie odpowiednikiem tego jest List<? extends T>
fun fun1(obj: Producer<String>) {
    val ref : Producer<Any> = obj    //takie podstawienie jest mozliwe bo String dziedziczy po Any
    //adres obj ref sa takie same
}

//A<in T> to w Javie odpowiednikiem tego jest A<? super T>
interface Consumer<in T> {
    fun consume(el: T)
}

fun fun2(obj: Consumer<Any>) {
    val ref : Consumer<Double> = obj     //to jest mozliwe bo Double : Any
}

class ListHelper {
    companion object {
        fun <T : Number> allNumbersDuplicate(item: T, n: Int): List<T> {
            val result = ArrayList<T>()
            repeat(n) {
                result.add(item)
            }
            return result
        }
    }
}

fun main() {
    val list: List<Any> = listOf(42, "Abc")
    val list2: List<*> = listOf(42, "Abc")

    fun gg(l: MutableList<Any>) {
        l.add('A')  //tutaj modyfikujemy przekazana przez referencje liste
        l[0]
    }

    fun gg2(l: MutableList<*>) {  //l w tym przypadku jest readonly
//        l.add('V')
        l[0]
    }
}