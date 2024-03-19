package lab4

import kotlin.random.Random

fun main(){
    val mass = mutableListOf<Int>()
    print("Введите количество элементов: ")
    val count = readln().toInt()
    for (i in 1..count) {
        print("Введите элемент $i: ")
        val z = readln().toInt()
        mass.add(z)
    }
    val max=mass.maxOrNull()
    val min=mass.minOrNull()
    println(mass)
    println("Минимун: $min, Максимум: $max")
}