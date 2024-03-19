package lab3

fun main(){
    println("Введите произвольное число")
    val z= readln().toInt()
    for (i in 1..z){
        if(z%i==0){
            print("$i, ")
        }
    }
}
