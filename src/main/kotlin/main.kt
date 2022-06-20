fun agoToTextH(hours: Int): String {
    val printText = when (hours) {
        1, 21 -> "$hours час"
        2, 3, 4, 22, 23 -> "$hours часа"
        else -> "$hours часов"
    }
    return "в сети " + printText + " назад"
}

fun agoToTextM(minuts: Int): String {
    val printText = when (minuts) {
        1, 21, 31, 41, 51 -> "$minuts минуту"
        2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> "$minuts минуты"
        else ->"$minuts минут"
        //5..20, 25..30, ->"$minuts минут назад"
    }
    return printText + " назад"
}

fun main() {
    val seconds: Int = 1260
    val printText = when (seconds) {
        in 0..60 -> "только что"
        in 61..3600 -> agoToTextM(seconds / 60)
        in 3601..24 * 60 * 60 -> agoToTextH(seconds / 3600)
        in 24 * 60 * 60 + 1..2 * 24 * 60 * 60 -> "в сети вчера"
        in 2 * 24 * 60 * 60 + 1..3 * 24 * 60 * 60 -> "в сети позавчера"
        //in 3 * 24 * 60 * 60 + 1..3 * 24 * 60 * 60 -> "Давно"
        else -> " в сети давно"
    }
    println("был(а) " + printText)
}