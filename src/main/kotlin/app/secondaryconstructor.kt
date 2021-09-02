package app

import data.Address

fun main() {
    val address1 = Address("Curug Dolog", "Ciamis")
    val address2 = Address("Sukasirna", "Ciamis", "Indonesia")


    println("Jalan ${address1.street}, Kabupaten ${address1.city}")
    println(address2.street)
    println(address2.city)
    println(address2.country)
}