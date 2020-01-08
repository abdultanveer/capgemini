package com.spot.capgemini.oops

fun buildAquarium(){
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()


}



fun main(){
    buildAquarium()
}