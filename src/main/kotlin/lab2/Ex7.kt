package lab2

fun main(){
    val first = readln().toInt()
    val second = readln().toInt()
    val result = if (first % 2 == 0 && second % 2 == 0) true else false
    println(result)
}