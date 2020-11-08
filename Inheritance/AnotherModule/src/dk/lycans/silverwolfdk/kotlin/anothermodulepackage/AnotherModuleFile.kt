package dk.lycans.silverwolfdk.kotlin.anothermodulepackage

import dk.lycans.silverwolfdk.kotlin.tutorials.CompanyCommunications
import dk.lycans.silverwolfdk.kotlin.tutorials.topLevel
import dk.lycans.silverwolfdk.kotlin.tutorials.upperFirstAndLast

fun main() {
    topLevel("Hello from another module package.")
    println("a string to work with".upperFirstAndLast())
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
}