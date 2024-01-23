package org.example.com.isnandarhmd.kotlin.kotlinFundamental

// Function

fun main() {
    val user = setUser("Isnandar", "Humaedi", 24)
    println(user)

    printUser("haha","Humaedi")

    printAge(25)
} // Function body

fun setUser(firstname: String, lastName: String, age: Int) = "Your name is $firstname $lastName, and your $age years old" // Expression body

fun printUser(firstname: String, lastName: String) {
    println("Your name is $firstname $lastName")
} // fun functionName(parameter1: type, parameter2: type): ReturnType { return result }

fun printAge(age: Int) {
    println("Your age is $age")
}

/*
  output :
      Your name is Isnandar Humaedi, and your 24 years old
      Your name is haha Humaedi
      Your age is 25
*/