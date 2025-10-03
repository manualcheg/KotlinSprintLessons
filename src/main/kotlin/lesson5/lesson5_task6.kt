package org.example.lesson5

import kotlin.math.pow

fun main() {
    val weight: Double //Kg
    val height: Double //centimeters

    println("Укажите ваш вес в Кг:")
    weight = readln().trim().toDouble()
    println("Укажите ваш рост в см:")
    height = readln().trim().toDouble()

    val imt = weight / (height / 100).pow(2)

    val resultToPrint = if (imt in 0.0..<18.5) {
        "ИМТ < 18.5: Недостаточная масса тела"
    } else if (imt in 18.5..<25.0) {
        "18.5 ≤ ИМТ < 25: Нормальная масса тела"
    } else if (imt in 25.0..<30.0) {
        "25 ≤ ИМТ < 30: Избыточная масса тела"
    } else {
        "ИМТ ≥ 30: Ожирение"
    }
    println("\nВаш ИМТ = %.2f".format(imt))
    println("\n$resultToPrint")
}