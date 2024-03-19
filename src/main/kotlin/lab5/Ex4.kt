package lab5
fun countWords(words: String): Int {
    val normStroke = words.trim()
    val word = normStroke.split(Regex("[/,.!?\\s]+"))
    return word.size
}

fun main() {
    println("Введите строку:")
    val words = readln()
    println("Количество слов в строке: ${countWords(words)}")
}
