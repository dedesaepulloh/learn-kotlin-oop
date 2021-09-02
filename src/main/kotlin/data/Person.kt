package data

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String) {
        println("Hello $name, My Name Is $firstName")
    }

    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, My Name Is ${this.firstName}")
    }

    fun run(){
        println("I'm Run")
    }

    fun getFullName() : String {
        return "$firstName $middleName $lastName"
    }
}