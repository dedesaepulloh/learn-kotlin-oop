package data

open class Shape {
    open val corner: Int = -1
}

class Retangle : Shape(){
    override val corner: Int = 3
}

class Triangle : Shape(){
    override val corner: Int = 4
}