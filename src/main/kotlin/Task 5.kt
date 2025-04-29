fun main() {
    val seconds = 6480
    val hours = seconds / 3600
    val minutes = (seconds - hours *3600) / 60
    val sec = seconds - hours * 3600 - minutes * 60
    print("0" + hours)
    print(":" + minutes + ":")
    print("0" + sec)
}