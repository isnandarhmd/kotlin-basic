package org.example.com.isnandarhmd.kotlin.kotlinFundamental

// String

fun main(){
    val text = "Kotlin"
    val firstChar = text[0] // indexing
    val statement = "Kotlin is \"Awesome!\"" // Escaped String = \", \', \\, \t, \n
    val unicode = "Unicode test: \u00A9"
    val line = """
        Line 1
        Line 2
        Line 3
    """.trimIndent() // Raw String

    for (char in text){
        print("$char ")
    } // Iterate over String objects using for-loop

    println("\nFirst character of $text is $firstChar")
    println(statement)
    println(unicode)
    print(line)
}

/*
  output :
      K o t l i n
      First character of Kotlin is K
      Kotlin is "Awesome!"
      Unicode test: ©
      Line 1
      Line 2
      Line 3
*/