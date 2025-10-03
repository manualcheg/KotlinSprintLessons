package org.example.lesson5

const val RAGE_OF_NUMBERS_MIN = 0
const val RAGE_OF_NUMBERS_MAX = 42

fun main() {
    val firstNumber = (RAGE_OF_NUMBERS_MIN..RAGE_OF_NUMBERS_MAX).random()
    val secondNumber = (RAGE_OF_NUMBERS_MIN..RAGE_OF_NUMBERS_MAX).random()
    println("Загадано два числа из диапазона: от $RAGE_OF_NUMBERS_MIN до $RAGE_OF_NUMBERS_MAX")
    println("Угадайте первое число. Введите ваш вариант:")
    val answerFirst = readln().trim().toInt()
    println("Угадайте второе число. Введите ваш вариант:")
    val answerSecond = readln().trim().toInt()

    val firstNumberGuessed = answerFirst == firstNumber || answerFirst == secondNumber
    val secondNumberGuessed = answerSecond == firstNumber || answerSecond == secondNumber

    val result = if (firstNumberGuessed && secondNumberGuessed) {
        "\nПоздравляем! Вы выиграли главный приз!"
    } else if (firstNumberGuessed || secondNumberGuessed) {
        "\nВы выиграли утешительный приз!"
    } else ("\nНеудача!")

    println(result)
    println("\nБыли загаданы: $firstNumber, $secondNumber")
}