package org.example.com.isnandarhmd.kotlin.kotlinFundamental

// If Expressions

fun main() {
    val openHours = 7
    val now = 7
    val office : String = if (now > 7) {
        "Office already open"
    } else if (now == openHours){
        "wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)
}

// output : wait a minute, office will be open