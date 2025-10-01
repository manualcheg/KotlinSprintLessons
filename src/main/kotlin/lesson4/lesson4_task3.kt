package org.example.lesson4

fun main() {
    val isWeatherSun = true
    val isTentOpened = true
    val humidity = 20
    val season = "зима"

    val isGoodConditions: Boolean =
        isWeatherSun && isTentOpened && (humidity == 20) && (season != "зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $isGoodConditions")
}