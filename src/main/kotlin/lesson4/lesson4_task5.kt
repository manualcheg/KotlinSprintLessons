package org.example.lesson4

fun main() {
    var isShipNoDamage = false
    var sizeOfCrew = 1
    var quantityOfFood = 1
    var isWeatherGood = false

    println("Введите цифру погоды: 1 - хорошая, 2 - плохая")
    isWeatherGood = readln().trim() == "1"

    println("Введите размер команды:")
    sizeOfCrew = readln().trim().toInt()

    println("Введите размер количество ящиков с едой:")
    quantityOfFood = readln().trim().toInt()

    println("Есть ли повреждения у корабля? 1 - да, 2 - нет")
    isShipNoDamage = readln().trim() == "2"

    val isTravelPossible: Boolean =
        (isShipNoDamage && (sizeOfCrew >= 55 && sizeOfCrew <= 70) && quantityOfFood > 50) ||
                (!isShipNoDamage && sizeOfCrew == 70 && quantityOfFood >= 50 && isWeatherGood)

    val wordNo = if (isTravelPossible) "" else {
        " НЕ"
    }
    println("\nКорабль$wordNo может отправится в плавание!")
}