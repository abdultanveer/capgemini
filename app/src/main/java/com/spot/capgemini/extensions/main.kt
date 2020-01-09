package com.spot.capgemini.extensions

fun main(args: Array<String>){
    val stringList: ArrayList<String> = arrayListOf<String>("Ashu","Ajay")
    stringList.printValue()
    val floatList: ArrayList<Float> = arrayListOf<Float>(10.5f,5.0f,25.5f)
    floatList.printValue()
    val doubleList: ArrayList<Double> = arrayListOf<Double>(10.12,12.34,34.4565)
    doubleList.printValue()
}
fun <T>ArrayList<T>.printValue(){
    for(element in this){
        println(element)
    }
}