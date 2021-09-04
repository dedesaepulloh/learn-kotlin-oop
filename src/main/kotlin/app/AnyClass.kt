package app

import data.SmartPhone

fun main() {
    val smartPhone = SmartPhone("Galaxy", "Android")
    println(smartPhone.toString())
    println(smartPhone.hashCode())

}