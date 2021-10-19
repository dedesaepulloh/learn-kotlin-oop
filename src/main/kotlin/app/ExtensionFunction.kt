package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student: Student? = Student("Dede", 23)
    student.sayHello("Rahmat")
    println(student?.upperName)
}