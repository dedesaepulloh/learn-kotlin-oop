package app

import data.Retangle

fun main() {
    val retangle = Retangle()
    println("Corner ${retangle.corner}")
    println("Parent Corner ${retangle.parentCorner}")

    retangle.printName()
}