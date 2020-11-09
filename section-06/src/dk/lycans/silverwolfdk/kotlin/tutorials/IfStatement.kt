package dk.lycans.silverwolfdk.kotlin.tutorials

fun main() {

    // If statement
    var num: Int
    if (1 == 2) {
        num = 50
    } else {
        num = 500
    }
    println(num)

    // If expression
    val num2 = if (1 == 1) 50 else 500
    println(num2)

    val num3 = if (2 == 1) {
        println("2 == 1")
        50
    } else {        // else is required when used is an expression.
        println("2 != 1")
        500
    }
    println(num3)

    val num4 = if (3 == 2) {
        println("3 == 2")
    } else {
        println("3 != 2")
    }
    println(num4.javaClass)

    println(if (1 == 1) 50 else 500)
    println("The result of the if expression is: ${if (1 == 2) 50 else 500}")
}