package app

import data.User

fun main() {
    val user1 = User("Eko", "rahasia")
    val user2 = User("Joko", "rahasia123")


    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}