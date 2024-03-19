package lab1

fun main(){
    var day = 2642;
    val year = day/365
    day%=365
    val weeks = day/7
    day%=7
    print("Лет: $year, недель: $weeks, дней: $day ")
}