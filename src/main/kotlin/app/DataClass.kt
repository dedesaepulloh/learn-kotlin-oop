package app

import data.Product

fun main() {
    val product = Product("Supermie", 5_000, "Food")
    println(product)

    val product2 = product.copy(name = "Indomie", price = 2500)
    println(product2)
}