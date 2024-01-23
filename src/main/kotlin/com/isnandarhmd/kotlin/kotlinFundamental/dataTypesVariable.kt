package org.example.com.isnandarhmd.kotlin.kotlinFundamental

// Data Type & Variable

fun main() {
    var firstName: String = "Isnan" // var identifier: Type = initialization
    firstName = "Isnandar " // val can be reassigned

    val lastName = "Huma" // Type inference
    // lastName = "Humaedi" // val cannot be reassigned

    val valueA = 10
    val valueB = 9

    println(firstName + lastName)
    println(valueA + valueB)
}

/*
    Output:
        Isnandar Humaedi
        19
*/