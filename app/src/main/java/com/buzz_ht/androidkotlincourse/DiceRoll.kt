package com.buzz_ht.androidkotlincourse

class DiceRoll(val numSides : Int) {

    fun roll() : Int{
        return (1..numSides).random()
    }



}

fun main(){

    val dice1 = DiceRoll(6)
    println("My ${dice1.numSides} faced dice rolled : ${dice1.roll()}")

    var dice2 = DiceRoll(12)
    println("My ${dice2.numSides} faced dice rolled : ${dice2.roll()}")
}