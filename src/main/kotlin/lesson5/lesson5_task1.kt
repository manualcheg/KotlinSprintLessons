package org.example.lesson5

fun main() {
    val number1 = (0..10).random()
    val number2 = (0..10).random()

    println("Введите решение примера: $number1 + $number2 = ")
    val answer = readln().trim().toInt()
    println(if (answer == number1 + number2) "\nДобро пожаловать!" else "\nДоступ запрещен.")
}