package org.example.lesson2

fun main() {
    val countOfStudent = 4
    val scoreStudent1 = 3
    val scoreStudent2 = 4
    val scoreStudent3 = 3
    val scoreStudent4 = 5
    val middleScore: Float = (scoreStudent1 + scoreStudent2 + scoreStudent3 + scoreStudent4).toFloat() / countOfStudent
    println("%.2f".format(middleScore))
}