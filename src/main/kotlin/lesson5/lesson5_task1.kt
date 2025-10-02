package org.example.lesson5

private const val ANSWER = "16"
private const val QUESTION = "Введите решение примера: 7 + 9 = "

fun main() {
    println(QUESTION)
    val answer = readln().trim()
    println(if (answer == ANSWER) "\nДобро пожаловать!" else "\nДоступ запрещен.")
}