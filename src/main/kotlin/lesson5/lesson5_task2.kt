package org.example.lesson5

import java.time.Year

const val AGE_ALLOWED = 18

fun main() {
    println("Введите год вашего рождения:")
    val yearOfBirth = readln().trim().toInt()
    val oldEnough = (Year.now().value - yearOfBirth) >= AGE_ALLOWED
    println(if (oldEnough) "\nПоказать экран со скрытым контентом" else "\nВыйти на главный экран")
}