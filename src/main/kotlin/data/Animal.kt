package data

abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Cat : Animal() {
    override val name: String = "Cat"
    override fun run() {
        println("$name run")
    }
}
class Dog : Animal() {
    override val name: String = "Dog"
    override fun run() {
        println("$name run")
    }
}