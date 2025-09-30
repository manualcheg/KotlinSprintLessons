package org.example.lesson2

import kotlin.math.pow

fun main() {
    val moneyStart = 70_000
    val ratePercentage = 16.7
    val numberOfChargesInYear = 1
    val yearsOfDeposit = 20
    val result = moneyStart * ((1 + (ratePercentage / 100) / numberOfChargesInYear)
        .pow(numberOfChargesInYear * yearsOfDeposit))
    println("%.3f".format(result))
}