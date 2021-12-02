fun main(){
    val message = "Happy Birthday! Justin!"
    println(message)

//    string functions
    println(message.substring(startIndex = 16))
    println(message.length)
    println(message.dropLast(9))
    println(message.uppercase())
    println(message.lowercase())


    val newString = " "
    println(newString.isBlank()) //true
    println(newString.isEmpty()) //false

    val firstName = "Chris"
    val lastName = "Soriano"
    val middleName = "Navarro"
    val age = 25
    var fullName =""
    fullName = "$firstName $lastName"
    println(fullName)

    println("My full name is $firstName ${middleName.first()} $lastName")
    println("My age 10 years from now is ${age + 10}")

    val nickName = "chris"
    val product = 100
    val amount = 10

    print("Hi ${nickName.capitalize()}, $product of those is ${product*amount}")
//    template literals

    val str = "string"
    println("")
    println(str.substring(1,str.length-1))


}