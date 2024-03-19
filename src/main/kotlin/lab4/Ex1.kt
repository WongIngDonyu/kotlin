package lab4

fun main(){
    val z= readln().toInt()
    val x = readln().toInt()
    val max:Int
    val min:Int
    if (z>x){
        max=z
        min=x
    }
    else{
        max=x
        min=z
    }
    val mass= (min..max).toList()
    println("Введённые числа: $z и $x. Массив: $mass")
}