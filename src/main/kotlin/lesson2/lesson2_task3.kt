package org.example.lesson2

import org.example.lesson1.TIME_CONST

fun main() {
    val hourStart: Int = 9
    val minutesStart: Int = 39
    val timeTravel: Int = 457
    var hourArrive: Int = hourStart + timeTravel / TIME_CONST
    val minutesRemainder = minutesStart + timeTravel % TIME_CONST
    val minutesArrive: Int = if (minutesRemainder < TIME_CONST) {
        minutesRemainder
    } else {
        hourArrive++
        minutesRemainder - TIME_CONST
    }
    println("Время прибытия поезда: %02d:%02d".format(hourArrive, minutesArrive))
}