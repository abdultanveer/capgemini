package com.spot.capgemini

val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun main() {
    //println( decorations.filter {it[0] == 'p'})
    /*val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: " + filtered)*/
    /*val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")*/


    var dirtyLevel = 20
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))
}

/*private  int getWaterFilter(int dirty){
    return dirty/2;
}*/

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}