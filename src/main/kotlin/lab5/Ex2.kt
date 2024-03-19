package lab5

fun Int.okonchan():String{
    val first =this.toString().first().toString().toInt()
    return when (first) {
        1 -> "$this год"
        in 2..4 -> "$this года"
        else -> "$this лет"
    }
}

fun main(){
    println("Введите количество лет: ")
    val years= readln().toInt()
    println(years.okonchan())
}