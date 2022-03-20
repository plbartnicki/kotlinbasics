package entities

//secondary constructors
class Box {
    //jesli nie podam jawnie modyfikatora to ten modyfikator jest domyslnie public
    var stringdata: String = ""
    var intdata = 0

    constructor(stringdata: String) {
        this.stringdata = stringdata
    }

    constructor(stringdata: String, intdata: Int) {
        this.stringdata = stringdata
        this.intdata = intdata
    }

    fun resetAllData() {
        stringdata = ""
        intdata = 0
    }

    private fun f() {

    }

    override fun toString(): String {
        return "Box(stringdata='$stringdata', intdata=$intdata)"
    }
}