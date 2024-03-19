package lab2

fun main(){
    val losses = readln().toDouble()
    val profit = readln().toDouble()
    val balance = profit-losses
    if(profit>losses){
        println("Ваша прибыль составила: $balance")
    }
    else{
        println("Ваша убыль составила: $balance")
    }
}