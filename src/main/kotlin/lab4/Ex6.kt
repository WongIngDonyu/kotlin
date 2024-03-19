package lab4

fun main(){
    val mass = mutableListOf<Int>()
    print("Введите количество элементов: ")
    val count = readln().toInt()
    for (i in 1..count) {
        print("Введите элемент $i: ")
        val z = readln().toInt()
        mass.add(z)
    }
    val sred:Int
    var sum=0
    for (i in mass) {
        sum+=i
    }
    sred=sum/count
    println("Среднее арифметическое: $sred")
    for (i in mass) {
        if(i>sred){
            print("$i ")
        }
    }
}