package dk.lycans.silverwolfdk.kotlin.tutorials

import dk.lycans.silverwolfdk.java.tutorials.DummyClass
import java.math.BigDecimal


fun printText(text: String) {
    println(text)
}

fun main() {
    // Int
    // If you assign an whole number (Int) you don't need to declare the datatype as Int is the default for whole
    // numbers.
    val myInt = 10
    println("Default datatype for whole numbers is Int: ${myInt is Int}")

    var myLong = 22L

    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short

    myShort = myByte.toShort()

    val anotherInt = 5


    // Floating point numbers.
    var myDouble = 65.984

    println("myDouble is a Double: ${myDouble is Double}")

    val myFloat = 838.8492f

    println("myFloat is a Float: ${myFloat is Float}")

    myDouble = myFloat.toDouble()

    // Char datatype
    val myChar = 'b'
    println("myChar is a Char: ${myChar is Char}")

    val myChar2: Char = 65.toChar()
    println("myChar2 is the following: $myChar2")

    // Boolean
    val myBoolean = true
    println("myBoolean is Boolean: ${myBoolean is Boolean}")

    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)

    // Any class
    val myAny: Any

    // Unit class
    val myUnit: Unit

    // Nothing class
    val myNothing: Nothing

    // Arrays
    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4)
    val longs3 = arrayOf(1,2,3,4)

    println(longs1 is Array<Long>)
    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)

    println(longs1[2])

    val evenNumbers = Array(16) {i -> i * 2}

    for(number in evenNumbers) {
        println(number)
    }

    val lotsOfNumbers = Array(100000) { i -> i + 1 }

    val allZeros = Array(100) { 0 }

    var someArray: Array<Int>

    someArray = arrayOf(1,2,3,4)

    for (number in someArray)
        println(number)

    someArray = Array(6) { i -> (i + 1) * 10}

    for (number in someArray)
        println(number)

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')

    for (element in mixedArray)
        println(element)

    println(mixedArray is Array<*>)

    val dummyClass = DummyClass()
    val myIntArray = arrayOf(10, 23, 43, 23, 13, 15)
    val myIntArray2 = intArrayOf(12, 14, 1,54, 235, 53)

    dummyClass.printNumbers(myIntArray.toIntArray())
    dummyClass.printNumbers(myIntArray2)

    // Null references and their protections.
    val str: String? = null
    println("What happens when we do this: ${str?.toUpperCase()}")

    val str2 = str ?: "This is the default value"
    println(str2)

    val something: Any = arrayOf(1,2,3,4)
    val str3 = something as? String
    println(str3)
    println(str3?.toUpperCase())

    try {
        val str4 = str!!.toUpperCase()
        println(str4)
    }
    catch (e:NullPointerException) {
        println("Str is null.")
    }

/*    val str5: String? = null
    val str6 = str5!!                   // Null Pointer Exception.
    val str7 = str6.toUpperCase()
    println(str7)

    str5?.let { printText(it) }
*/
    val str8: String? = null
    val anotherStr = "This isn't nullable"
    println(str8 == anotherStr)


    // Array of nulls.
    val nullableInts = arrayOfNulls<Int>(5)
    for (i in nullableInts) {
        println(i)
    }
    println(nullableInts[3].toString())

}