package com.spot.capgemini.classes

fun main() {
    /*val dog: Dog = Yorkshire()
    dog.sayHello()*/
    /*val tiger: Tiger = SiberianTiger()
    tiger.sayHello()*/
    val decoration2 = Decoration2("rocks","wood","diver")
    //decoration2.makeDecorations()
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

// Assign all properties to variables.
    val (rock, diver) = d5
    println(rock)
   // println(wood)
    println(diver)
}