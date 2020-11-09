package dk.lycans.silverwolfdk.kotlin.tutorials

import java.math.BigDecimal

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main() {
    var num = 200

    when(num) {
        in 100..199 -> println("Between 100 and 199, inclusive.")
        200 -> println("200")
        300 -> println("300")
        else -> println("Doesn't match anything.")
    }

    val y = 10

    when(num) {
        y + 80 -> println("90")
        y + 90 -> println("100")
        300 -> println("300")
        else -> println("Doesn't match anything.")
    }

    val obj: Any = "I'm a string."
    val obj2: Any = BigDecimal(25.2)
    val obj3: Any = 45
    val obj4: Any = arrayListOf("20")

    val something: Any = obj4
//    if (something is String) {
//        something.toUpperCase()
//    } else if (something is BigDecimal) {
//        println(something.remainder(BigDecimal(10.5)))
//    } else if (something is Int) {
//        println("${something - 22}")
//    }
    val z = when(something) {
        is String -> something.toUpperCase()
        is BigDecimal -> something.remainder(BigDecimal(10.5))
        is Int -> "${something - 22}"
        else -> "something variable is neither: String, BigDecimal nor Int."
    }

    println(z.javaClass)
    println(z)

    val timeOfYear = Season.WINTER

    val str = when(timeOfYear) {
        Season.SPRING -> {
            num += 5
            "Flowers are blooming!"
        }
        Season.SUMMER -> "It's HOT!!"
        Season.FALL -> "It's getting cooler"
        Season.WINTER -> {
            num = 25 - 55
            "Time to get a coat.."
        }
    }
    println(str)
    println(num)

    val num2 = -50

    when {
        num < num2 -> println("Num is less than num2")
        num > num2 -> println("Num is greater than num2")
        else -> println("num is equal to num2")
    }
}