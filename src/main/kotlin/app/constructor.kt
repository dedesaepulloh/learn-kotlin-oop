package app

import data.Car

fun main() {
    val avanza = Car("Toyota")
    val almaz = Car("Wuling", 2019)

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}