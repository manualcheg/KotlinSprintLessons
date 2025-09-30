package org.example.lesson3

fun main() {
    val result = "[%s %s %s, %d]"
    val familyOld = "Андреева"
    val familyNew = "Сидорова"
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    val age1 = 20
    val age2 = 22
    var age = age1
    println(result.format(familyOld, name, patronymic, age))
    age = age2
    println(result.format(familyNew, name, patronymic, age))
}