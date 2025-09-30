package org.example.lesson3

fun main() {
    var family = "Андреева"
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    val age1 = 20
    val age2 = 22
    var age = age1
    println("[$family $name $patronymic, $age]")
    age = age2
    family = "Сидорова"
    println("[$family $name $patronymic, $age]")
}