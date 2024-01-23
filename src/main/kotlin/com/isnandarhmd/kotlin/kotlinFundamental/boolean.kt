package org.example.com.isnandarhmd.kotlin.kotlinFundamental

// Boolean

fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    // val isOpen = now >= officeOpen && now <= officeClosed // Conjunction or AND (&&)
    val isOpen = now in officeOpen..officeClosed // Converted to a range check
    val isClose = now < officeOpen || now > officeClosed // Disjunction or OR (||)

    if (!isOpen) { // Negation or NOT (!)
        println("Office is closed")
    } else {
        println("Ofiice is open")
    }

    println("Office is open : $isOpen")
    print("Office is closed : $isClose")
}

/*
  output :
      Office is closed
      Office is open : false
      Office is closed : true
*/