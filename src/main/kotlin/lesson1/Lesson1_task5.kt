package org.example.lesson1

const val TIME_CONST = 60

fun main() {
    var seconds: Int = 6480
    var minutes: Int = seconds / TIME_CONST
    var hours: Int = minutes / TIME_CONST
    val secondsRemaining = seconds % TIME_CONST
    val minutesRemaining = minutes % TIME_CONST

    println("%02d:%02d:%02d".format(hours, minutesRemaining, secondsRemaining))
}