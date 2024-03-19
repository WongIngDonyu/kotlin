package lab3

import kotlin.random.Random

fun main(){
    val x = Random.nextInt(1,9)
    var z= readln().toInt();
    while (z!=x){
        println("Неверное чилсло. Введите снова ")
        z= readln().toInt()
    }
    println("Число верно. ГЦ!")
}