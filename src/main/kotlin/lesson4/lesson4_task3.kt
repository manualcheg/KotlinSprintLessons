package org.example.lesson4

const val HUMIDITY_IDEAL = 20
const val SEASON_BAD = "зима"

fun main() {
    val isWeatherSun = true
    val isTentOpened = true
    val humidity = 20
    val season = "зима"

    val isGoodConditions: Boolean =
        isWeatherSun && isTentOpened && (humidity == HUMIDITY_IDEAL) && (season != SEASON_BAD)

    println("Благоприятные ли условия сейчас для роста бобовых? $isGoodConditions")
}