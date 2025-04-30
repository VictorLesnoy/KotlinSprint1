fun main() {
    val sixtie = 60
    val seconds = 6480
    val hours = seconds / sixtie / sixtie
    val minutes = (seconds - hours * sixtie * sixtie) / sixtie
    val sec = seconds - hours * sixtie * sixtie - minutes * sixtie
    println("%02d:%02d:%02d".format(hours, minutes, sec))
}