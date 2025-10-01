package org.example.lesson4

const val CAPACITY = 13

fun main() {
    val bookedToday = 13
    val bookedTomorrow = 9

    val message = "[Доступность столиков на сегодня: ${bookedToday < CAPACITY}],\n" +
            "[Доступность столиков на завтра: ${bookedTomorrow < CAPACITY}]."
    println(message)
}