package org.example.lesson1

fun main() {
    var seconds: Int = 6480
    var minutes: Int = 0
    var hours: Int = 0
    minutes = seconds / 60
    seconds = seconds % 60
    hours = minutes / 60
    minutes = minutes % 60
    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}