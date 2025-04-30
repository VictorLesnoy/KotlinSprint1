fun main() {
    val workers = 50
    val workerSalary = 30000
    val intern = 30
    val internSalary = 20000
    val totalWorkerSalary = workers * workerSalary
    val totalSalary = (workers * workerSalary) + (intern * internSalary)
    val averageSalary = totalSalary / (workers + intern)
    println("Расходы на выплату зарплаты постоянных сотрудников: " + totalWorkerSalary)
    println("Общие расходы по ЗП после прихода стажеров: " + totalSalary)
    println("Среднюю ЗП одного сотрудника после устройства стажеров: " + averageSalary)
}