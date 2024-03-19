package lab5
import java.util.*

fun skidon(number:Double, procent:Double): Double {
    val skidka = (number*procent)/100
    return String.format(Locale.US, "%.2f", number-skidka).toDouble()
}
fun main(){
    println("Введите начальную цену товара:")
    val initialPrice = readln().toDouble()
    println("Введите процент скидки:")
    val discountPercent = readln().toDouble()
    println("Конечная цена: ${skidon(initialPrice, discountPercent)}")
}