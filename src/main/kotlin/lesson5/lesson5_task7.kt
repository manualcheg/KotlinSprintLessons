package org.example.lesson5

private const val STANDARD_DISTANCE = 100

fun main() {
    println("Укажите расстояние поездки (км):")
    val distance = readln().trim().toDouble()

    println("Введите расход средний расход топлива для вашего авто (л/100км):")
    val fuelUse = readln().trim().toDouble()

    println("Введите стоимость топлива для вашего автомобиля (руб/литр):")
    val fuelCost = readln().trim().toDouble()

    val fuelTotal = (distance / STANDARD_DISTANCE) * fuelUse
    val fuelTotalCost = fuelTotal * fuelCost
    println(
        ("\nДля поездки потребуется %.2f литров топлива. " +
                "\nОбщая стоимость топлива составит %.2f рублей")
            .format(fuelTotal, fuelTotalCost)
    )
}