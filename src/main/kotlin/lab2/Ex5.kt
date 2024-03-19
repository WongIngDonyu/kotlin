package lab2

fun main(){
    val first = readln().toDouble()
    val second = readln().toDouble()
    val third = readln().toDouble()
    val average = listOf(first,second,third)
    println(average.sorted()[1])
}