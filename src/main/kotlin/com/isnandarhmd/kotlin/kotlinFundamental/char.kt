package org.example.com.isnandarhmd.kotlin.kotlinFundamental

// Char

fun main() {
    var vocal = 'A' // Char data type is a unicode representation. E.g : Unicode A = 0041
    // var character: Char = 'ABC' // Incorrect character literal

    println("Vocal " + vocal++) // Increment operation
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--) // Decrement operation
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
}

/*
   output:
       Vocal A
       Vocal B
       Vocal C
       Vocal D
       Vocal C
       Vocal B
       Vocal A
*/