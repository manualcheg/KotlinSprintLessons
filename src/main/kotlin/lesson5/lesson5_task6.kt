package org.example.lesson5

import kotlin.math.pow

private const val IMT_NOT_ENOUGH_MIN = 0.0
private const val IMT_NOT_ENOUGH_MAX = 18.5
private const val IMT_NORMAL_MAX = 25.0
private const val IMT_OVER_MAX = 30.0

fun main() {

    println("Укажите ваш вес в Кг:")
    val weight: Double = readln().trim().toDouble() //Kg
    println("Укажите ваш рост в см:")
    val height: Double = readln().trim().toDouble() //centimeters

    val imt = weight / (height / 100).pow(2)

    val resultToPrint = when (imt) {
        in IMT_NOT_ENOUGH_MIN..<IMT_NOT_ENOUGH_MAX -> "ИМТ < $IMT_NOT_ENOUGH_MAX: Недостаточная масса тела"
        in IMT_NOT_ENOUGH_MAX..<IMT_NORMAL_MAX -> "$IMT_NOT_ENOUGH_MAX ≤ ИМТ < $IMT_NORMAL_MAX: Нормальная масса тела"
        in IMT_NORMAL_MAX..<IMT_OVER_MAX -> "$IMT_NORMAL_MAX ≤ ИМТ < $IMT_OVER_MAX: Избыточная масса тела"
        else -> "ИМТ ≥$IMT_OVER_MAX: Ожирение"
    }
    println("\nВаш ИМТ = %.2f".format(imt))
    println("\n$resultToPrint")
}