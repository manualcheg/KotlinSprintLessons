package org.example.lesson4

fun main() {
    val counterOfDays = 4
    val isLegsAndBackDay = counterOfDays % 2 == 0

    println(
        """
        Упражнения для рук:       ${!isLegsAndBackDay}
        Упражнения для ног:       ${isLegsAndBackDay}
        Упражнения для спины:     ${isLegsAndBackDay}  
        Упражнения для пресса:    ${!isLegsAndBackDay}
    """.trimIndent()
    )
}