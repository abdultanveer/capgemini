package com.spot.capgemini.interfaces

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}