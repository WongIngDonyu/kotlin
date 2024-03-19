package lab1

fun main(){
    val number = readlnOrNull()
    val z = number?.toInt()
    for(num in z.toString()){
        print("$num ")
    }
}