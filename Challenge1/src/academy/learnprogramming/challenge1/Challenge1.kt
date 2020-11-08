package academy.learnprogramming.challenge1

fun main() {
    // Declare two immutable String variables called hello1 and hello2. Assign "Hello" to both variables.
    val hello1 = "Hello"
    val hello2 = "Hello"

    // Using one line of code, test whether hello1 and hello2 are referentially equal and print the result.
    println(hello1 === hello2)

    // Using one line of code, test whether hello1 and hello2 are structurally equal and print the result.
    println(hello1 == hello2)

    // Declare a mutable variable of type Int and assign it the value of 2988.
    var number = 2988

    // Declare an immutable variables of type Any and assign it the string "The Any type is the root of the Kotlin class
    // hierarchy", and then using a smart cast, print out the uppercase string.
    val anyString: Any = "The Any type is the root of the Kotlin class hierarchy"
    if (anyString is String) {
        println(anyString.toUpperCase())
    }

    // Using one line of code, print out the following. Make sure your code is nicely indented:
    //    1
    //   11
    //  111
    // 1111
    println("""
        *   1
        *  11
        * 111
        *1111
    """.trimMargin("*"))

    // Do like above but use the 1 as the trim character.
    println("""
        1   1
        1  11
        1 111
        11111
    """.trimMargin("1"))
}