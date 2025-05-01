fun main() {
    val grades = listOf(3, 4, 3, 5, 5, 5)
    val avg = String.format("Среднее: %.2f", grades.average())
    println(avg)
}