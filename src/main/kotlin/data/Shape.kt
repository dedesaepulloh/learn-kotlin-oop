package data

open class Shape {
    open val corner: Int = -1
    open fun printName(){
        println("This is Shape")
    }
}

class Retangle : Shape (){
    override val corner: Int = 3
    val parentCorner : Int = super.corner

    override fun printName() {
        println("This is Retangle")
        super.printName()
    }
}

open class Triangle : Shape(){
    override val corner: Int = 4
}