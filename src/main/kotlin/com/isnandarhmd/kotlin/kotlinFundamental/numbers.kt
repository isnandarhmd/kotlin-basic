package org.example.com.isnandarhmd.kotlin.kotlinFundamental

// Numbers

fun main() {
    val intNumber = 100 // Int (32 Bit) -2^31 to 2^31-1
    val longNumber = 100L // Long (64 Bit) -2^63 to 2^63-1
    val shortNumber : Short = 10 // Short (16 Bit) -2^15 to 2^15-1
    val byteNumber : Byte = 10 // Byte (8 Bit)
    val doubleNumber : Double = 1.3 // Double (64 Bit) fractional numeric up to a maximum of 15-16 numbers after the comma
    val floatNumber : Float = 0.123456789f // Float (32 Bit) only 0.1234567 is read, fractional numeric up to a maximum of 6-7 numbers after the comma

    val maxInt = Int.MAX_VALUE // Maximum value property
    val minInt = Int.MIN_VALUE // Minimum value property

    // val converttoInt: Int = byteNumber // Compile error
    val converttoInt: Int = byteNumber.toInt() // Used function of toInt(), toChar(), toByte() etc.

    val  stringNumber = "23"

    val readableNumber = 1_000_000

    println(maxInt)
    println(minInt)
    println(intNumber + stringNumber.toInt()) // Anoter example
    print(readableNumber) // Readable
}

/*
  output :
      2147483647
      -2147483648
      123
      1000000
*/