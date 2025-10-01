package org.example.lesson4

fun main() {
    var isShipNoDamage = false
    var sizeOfCrew = 1
    var quantityOfFood = 1
    var isWeatherGood = false

    println("Введите цифру погоды: 1 - хорошая, 2 - плохая")
    val bufferedReader = System.`in`.bufferedReader()
    var input = bufferedReader.readLine()
    isWeatherGood = input.trim() == "1"

    println("Введите размер команды:")
    input = bufferedReader.readLine()
    sizeOfCrew = input.trim().toInt()

    println("Введите размер количество ящиков с едой:")
    input = bufferedReader.readLine()
    quantityOfFood = input.trim().toInt()

    println("Есть ли повреждения у корабля? 1 - да, 2 - нет")
    input = bufferedReader.readLine()
    isShipNoDamage = input.trim() == "2"

    val isTravelPossible: Boolean =
        (isShipNoDamage && (sizeOfCrew >= 55 && sizeOfCrew <= 70) && quantityOfFood > 50) ||
                (!isShipNoDamage && sizeOfCrew == 70 && quantityOfFood >= 50 && isWeatherGood)

    val wordNo =
        if (isTravelPossible) {
            ""
        } else {
            " НЕ"
        }

    println("\nКорабль$wordNo может отправится в плавание!")
}