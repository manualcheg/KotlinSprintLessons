package org.example.lesson3

fun main() {
    var from = "E2"
    var where = "E4"
    var countOfMove = 1
    println("[$from-$where;$countOfMove]")

    from = "D2"
    where = "D3"
    countOfMove++
    println("[$from-$where;$countOfMove]")
}