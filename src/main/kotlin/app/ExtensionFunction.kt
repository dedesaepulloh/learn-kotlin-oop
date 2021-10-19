package app

import data.Student
import data.sayHello

fun main() {
    val student: Student? = Student("Dede", 23)
    student.sayHello("Rahmat")
}