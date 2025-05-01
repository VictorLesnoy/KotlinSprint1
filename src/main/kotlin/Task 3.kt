fun main() {
    val hours = 9
    val minutes = 39
    val onTheWay = 457
    val minutesOTW = onTheWay % 60
    val hoursOTW = onTheWay / 60
    val totalHours = hours + hoursOTW
    val totalMinutes = minutes + minutesOTW
    println("Прибытие поезда в $totalHours:$totalMinutes")
}