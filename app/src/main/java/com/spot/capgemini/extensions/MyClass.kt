package com.spot.capgemini.extensions

class MyClass {
    companion object {
        fun create(): String {
            return "calling create method of companion object"
        }
    }
}
fun MyClass.Companion.helloWorld() {
    println("executing extension of companion object")
}
fun main(args: Array<String>) {
    MyClass.helloWorld() //extension function declared upon the companion object
}  