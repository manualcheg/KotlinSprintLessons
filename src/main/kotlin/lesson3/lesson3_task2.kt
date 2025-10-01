package org.example.lesson3

fun main() {
    var family = "Андреева"
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var age = 20
    println("[$family $name $patronymic, $age]")

    age = 22
    family = "Сидорова"
    println("[$family $name $patronymic, $age]")
}