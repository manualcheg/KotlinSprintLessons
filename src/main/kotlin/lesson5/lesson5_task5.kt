package org.example.lesson5

fun main() {
    val rage = RAGE_OF_NUMBERS_MIN..RAGE_OF_NUMBERS_MAX
    val numbers = listOf(rage.random(), rage.random(), rage.random())
    val answers: MutableList<Int> = mutableListOf()

    println("Загадано три числа из диапазона: от $RAGE_OF_NUMBERS_MIN до $RAGE_OF_NUMBERS_MAX")
    for (i in 0..2) {
        println("Угадайте ${i + 1}-е число. Введите ваш вариант:")
        answers.add(readln().trim().toInt())
    }

    val result = numbers.intersect(answers.toSet()).size

    val resultToPrint = when (result) {
        1 -> "Вы угадали одно число и вам полагается утешительный приз!"
        2 -> "Вы угадали два числа и получаете крупный приз!"
        3 -> "Вы угадали все числа и выиграли ДЖЕКПОТ!!!"
        else -> "Вы не угадали ни одного числа!"
    }
    println("\n$resultToPrint")
    println("\nА были загаданы следующие числа: $numbers")
}