package com.spot.capgemini.oops

class Aquarium(var length: Int = 100,var width: Int = 20,var height: Int = 40) {
    //var height =height
    //var width = width
    //var length = length

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}
