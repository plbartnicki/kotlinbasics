package entities

class Customer constructor(val firstName: String,
                           val phoneNumber: String? = null,
                           val nationality: String = "Polish"
) {
    fun logData() {
        println(firstName + if(phoneNumber == null) " with no phone num " else phoneNumber + nationality)
    }
}