package org.example.lesson3

fun main() {
    val move = "D2-D4;0"
    val moveArray = move.split(";", "-")
    println(moveArray[0])
    println(moveArray[1])
    println(moveArray[2])
}