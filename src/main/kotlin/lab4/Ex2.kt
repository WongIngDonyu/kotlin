package lab4

fun main(){
    val mass = mutableListOf<Int>()
    mass.addAll(listOf(8,21,5,90,11,0))
    mass.add(0, 90)
    mass.removeAt(4)
    mass.add(-35)
    println(mass)
}