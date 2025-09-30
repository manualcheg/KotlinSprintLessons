package org.example.lesson2


fun main() {
    val teamSize = 50
    val salaryTeamWorker = 30_000
    val internsSize = 30
    val salaryIntern = 20_000
    val salaryCostsTeam = teamSize * salaryTeamWorker
    val salaryCostsInterns = internsSize * salaryIntern
    val summarySalaryCosts = salaryCostsTeam + salaryCostsInterns
    val middleSalary = summarySalaryCosts / (teamSize + internsSize)

    println("Расходы на выплату зарплаты постоянных сотрудников: \n$salaryCostsTeam рублей")
    println("Общие расходы по ЗП после прихода стажеров: \n$summarySalaryCosts рублей")
    println("Средняя ЗП одного сотрудника после устройства стажеров: \n$middleSalary рублей")
}