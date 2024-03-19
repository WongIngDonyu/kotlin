package lab2

fun main(){
    val age= readlnOrNull()?.toInt()
    if (age != null) {
        if(age<0){
            println("Неправильный возраст")
            return
        }
        when (age){
            in 0..17  -> println("Вы еще слишком молоды")
            18  -> println("Ура, Вам 18 лет!")
            else -> println("Вам уже все можно")
        }
    }
}
