package app

import data.Person

fun main() {
    val dede = Person()
    dede.firstName = "Dede"
    dede.middleName = "Rahmat"
    dede.lastName = "Saepulloh"

    dede.sayHello("Jaja")
    dede.run()
    val fullName = dede.getFullName()
    println(fullName)
}