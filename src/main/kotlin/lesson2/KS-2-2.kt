package org.example.lesson2

const val TEAM_SIZE = 50
const val SALARY_TEAM_WORKER = 30_000
const val INTERNS_SIZE = 30
const val SALARY_INTERN = 20_000

fun main() {
    val salaryCostsTeam = TEAM_SIZE * SALARY_TEAM_WORKER
    val salaryCostsInterns = INTERNS_SIZE * SALARY_INTERN
    val summarySalaryCosts = salaryCostsTeam + salaryCostsInterns
    val middleSalary = (salaryCostsTeam + salaryCostsInterns) / (TEAM_SIZE + INTERNS_SIZE)
    println("Расходы на выплату зарплаты постоянных сотрудников: \n$salaryCostsTeam рублей")
    println("Общие расходы по ЗП после прихода стажеров: \n$summarySalaryCosts рублей")
    println("Средняя ЗП одного сотрудника после устройства стажеров: \n$middleSalary рублей")
}