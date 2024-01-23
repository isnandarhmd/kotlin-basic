package org.example.com.isnandarhmd.kotlin.kotlinFundamental

// Nullable Types, Safe Calls Operator & Elvis Operator

fun main() {
    // val text: String = null // Compile time error
    // val textLenght = text.length // Compile error

    val text: String? = null

    if (text != null) {
        val textLenght = text.length
    }

    text?.length // Safe calls operator(?.)

    val elvisOperator = text?.length ?: 7 // Elvis Operator (?:)
}