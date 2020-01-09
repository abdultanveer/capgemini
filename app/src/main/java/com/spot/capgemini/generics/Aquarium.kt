package com.spot.capgemini.generics

class Aquarium<T: WaterSupply>(val waterSupply: T){
    //class Aquarium<T: Any?>(val waterSupply: T)

}
fun genericsExample() {

    val aquarium3 = Aquarium(TapWater())
    if (aquarium3.waterSupply == null) {
        println("waterSupply is null")
    }

    /*val aquarium2 = Aquarium("string")
    println(aquarium2.waterSupply)*/
    /*val aquarium = Aquarium(TapWater())
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")

    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
*/

}
fun main() {
    genericsExample()
}