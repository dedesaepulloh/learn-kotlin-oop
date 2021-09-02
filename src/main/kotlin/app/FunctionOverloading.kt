package app

import data.Person

fun main() {
    val dede = Person()
    dede.firstName = "Dede Saepulloh"

    dede.sayHello("Eko")
    dede.sayHello("Joko", "Anwar")
}