package org.example.com.isnandarhmd.kotlin.kotlinFundamental

// String Template

fun main() {
    val hour = 7
    print("Office at $hour ${if (hour > 7) "already close" else "is open"}") // String template ($)
}

// output : Office at 7 is open