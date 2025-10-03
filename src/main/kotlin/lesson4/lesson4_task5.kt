package org.example.lesson4

const val SIZE_OF_CREW_MIN = 55
const val SIZE_OF_CREW_MAX = 70
const val QUANTITY_OF_FOOD_MIN = 50

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
        (isShipNoDamage && (sizeOfCrew >= SIZE_OF_CREW_MIN && sizeOfCrew <= SIZE_OF_CREW_MAX)
                && quantityOfFood > QUANTITY_OF_FOOD_MIN) ||
                (!isShipNoDamage && sizeOfCrew == SIZE_OF_CREW_MAX &&
                        quantityOfFood >= QUANTITY_OF_FOOD_MIN && isWeatherGood)

    val wordNo = if (isTravelPossible) "" else " НЕ"
    println("\nКорабль$wordNo может отправится в плавание!")
}