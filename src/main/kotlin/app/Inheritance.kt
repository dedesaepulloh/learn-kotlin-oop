package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Dadang")
    manager.sayHello("Uho")

    val vicePresident = VicePresident("Uju")
    vicePresident.sayHello("Rohmat")
}