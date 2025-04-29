fun main() {
    val sixtie = 60
    val seconds = 6480
    val hours = seconds / sixtie / sixtie
    val minutes = (seconds - hours * sixtie * sixtie) / sixtie
    val sec = seconds - hours * sixtie * sixtie - minutes * sixtie
    var hour = String.format("%02d", hours)
    var second = String.format("%02d", sec)
    println(hour + ":" +  minutes + ":" + second)
}