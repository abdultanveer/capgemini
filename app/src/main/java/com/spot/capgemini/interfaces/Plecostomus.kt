package com.spot.capgemini.interfaces

class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by GoldColor{

}