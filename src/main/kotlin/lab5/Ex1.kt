package lab5

fun ocrug(number:Int):String{
    return when (number){
        in 1000..9999 -> {
            number.toString().replaceRange(1..3, "K")
        }
        else ->{
            number.toString()
        }
    }
}

fun main(){
    println("Введите число")
    println("Получаем ${ocrug(readln().toInt())}")
}