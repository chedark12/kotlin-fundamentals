import java.util.*

fun main(){
    println("What is your name?")
    val yourName = readLine()
    println("Hi $yourName!")
    println("What year is your birthday?")
    val  age = readLine()!!.toInt()
    val  year = 2021
    val final = year - age
    println(final)


}
