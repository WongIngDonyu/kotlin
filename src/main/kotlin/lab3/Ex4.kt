package lab3

fun main(){
    var z= readln().toInt()
    var x=0
    var c=0
    while (z!=0){
        val i =z%10
        if(i%2==0){
            x++
        }
        else{
            c++
        }
        z/=10
    }
    println("Кол-во чётных чисел: $x, Кол-во нечёт чисел: $c")
}