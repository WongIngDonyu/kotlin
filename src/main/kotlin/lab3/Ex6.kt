package lab3

fun main(){
    var sum=0
    var z=5
    while (z!=58){
        if (z != 34 && z != 46 && z != 52) {
            sum += z
        }
        z++
    }
    println(sum)
}