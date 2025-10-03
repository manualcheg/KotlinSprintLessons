package org.example.lesson5

import kotlin.math.pow

private const val IMT_NOT_ENOUGH_MIN = 0.0
private const val IMT_NOT_ENOUGH_MAX = 18.5
private const val IMT_NORMAL_MIN = 18.5
private const val IMT_NORMAL_MAX = 25.0
private const val IMT_OVER_MIN = 25.0
private const val IMT_OVER_MAX = 30.0

fun main() {

    println("Укажите ваш вес в Кг:")
    val weight: Double = readln().trim().toDouble() //Kg
    println("Укажите ваш рост в см:")
    val height: Double = readln().trim().toDouble() //centimeters

    val imt = weight / (height / 100).pow(2)

    val resultToPrint = when (imt) {
        in IMT_NOT_ENOUGH_MIN..<IMT_NOT_ENOUGH_MAX -> "ИМТ < 18.5: Недостаточная масса тела"
        in IMT_NORMAL_MIN..<IMT_NORMAL_MAX -> "18.5 ≤ ИМТ < 25: Нормальная масса тела"
        in IMT_OVER_MIN..<IMT_OVER_MAX -> "25 ≤ ИМТ < 30: Избыточная масса тела"
        else -> "ИМТ ≥ 30: Ожирение"
    }
    println("\nВаш ИМТ = %.2f".format(imt))
    println("\n$resultToPrint")
}