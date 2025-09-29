package org.example.lesson2

const val BUFF = 20

fun main() {
    val quantityIron = 11
    val quantityCrystal = 7
    val percent: Float = BUFF / 100F
    val bonusIronWithBuff = (quantityIron * percent).toInt()
    val bonusCrystalWithBuff = (quantityCrystal * percent).toInt()
    println("Бонус Железной руды: $bonusIronWithBuff")
    println("Бонус Кристаллической руды: $bonusCrystalWithBuff")
}