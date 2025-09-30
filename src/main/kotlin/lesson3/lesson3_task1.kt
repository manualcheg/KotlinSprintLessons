package org.example.lesson3


fun main() {
    val name = "Джон Коннор"
    val helloDay = "Доброго дня, %s!"
    val helloEvening = "Доброго вечера, %s!"

    var hello = helloDay
    println(hello.format(name))

    hello = helloEvening
    println(hello.format(name))
}