package dk.lycans.silverwolfdk.kotlin.tutorials.anotherPackage

import dk.lycans.silverwolfdk.kotlin.tutorials.CompanyCommunications as Comm
import dk.lycans.silverwolfdk.kotlin.tutorials.Department as Departments
import dk.lycans.silverwolfdk.kotlin.tutorials.topLevel as tp

fun main() {
    tp("Hello from another file.")
    println(Comm.getCopyrightLine())
    println(Departments.LAW.getDepartmentInfo())
    println(Departments.IT.getDepartmentInfo())
}