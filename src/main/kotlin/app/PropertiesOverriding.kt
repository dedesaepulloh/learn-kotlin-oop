package app

import data.Retangle
import data.Shape
import data.Triangle

fun main() {
    val shape = Shape()
    println(shape.corner)

    val shape2 = Retangle()
    println(shape2.corner)

    val shape3 = Triangle()
    println(shape3.corner)
}