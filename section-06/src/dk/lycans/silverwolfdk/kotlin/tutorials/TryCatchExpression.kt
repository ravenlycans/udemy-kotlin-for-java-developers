package dk.lycans.silverwolfdk.kotlin.tutorials

import java.lang.NumberFormatException

fun main() {
    println(getNumber("22.5"))
}

fun getNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        0
    }
}