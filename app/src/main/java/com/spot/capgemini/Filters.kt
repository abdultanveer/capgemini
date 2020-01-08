package com.spot.capgemini

val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun main() {
    //println( decorations.filter {it[0] == 'p'})
    /*val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: " + filtered)*/
    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
}