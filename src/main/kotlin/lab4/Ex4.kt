package lab4

fun main(){
    val mass = mutableListOf<Int>()
    print("Введите количество элементов: ")
    val count = readln().toInt()
    for (i in 1..count) {
        print("Введите элемент $i: ")
        val z = readln().toInt()
        mass.add(z)
    }
    mass.sort()
    println("Почти самый маленький: ${mass[1]}")
}