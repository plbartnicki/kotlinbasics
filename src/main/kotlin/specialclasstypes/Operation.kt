package specialclasstypes

/*
 Klasa sealed jest podobna do enum i dostarcza dodatkowo mozliwosci przechwytywania wartosci
 Klasas sealed to klasa abstrakcyjna
 W pliku, w ktorym jest ona zdefiniowana powinny znajdowac sie jej klasy pochodne
 */
sealed class Operation {
    class Add(val value : Int) : Operation()
    class Multiply(val value: Int): Operation()
}

//inny sposob:
//sealed class Operation
//
//class Add(val value : Int) : Operation()
//class Multiply(val value: Int): Operation()


