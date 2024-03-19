package lab2

fun main(){
    val first = 2
    val second = 6
    println("Меню:")
    println("1. Добавить")
    println("2. Отнять")
    println("0. Ничего")
    print("Введите номер операции: ")
    val choice = readlnOrNull()?.toInt()
    when (choice) {
        1 -> {
            val sum = first + second
            println("Сумма: $sum")
        }
        2 -> {
            val difference = first - second
            println("Разность: $difference")
        }
        0 -> println("Ничего не делаем.")
        else -> println("Некорректный выбор.")
    }
}