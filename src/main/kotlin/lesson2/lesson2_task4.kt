package org.example.lesson2

const val BUFF: Float = 0.2F

fun main() {
    val quantityIron = 7
    val quantityCrystal = 11
    val bonusIronWithBuff = (quantityIron*BUFF).toInt()
    val bonusCrystalWithBuff = (quantityCrystal*BUFF).toInt()
    println("Бонус Железной руды: $bonusIronWithBuff")
    println("Бонус Кристаллической руды: $bonusCrystalWithBuff")
}