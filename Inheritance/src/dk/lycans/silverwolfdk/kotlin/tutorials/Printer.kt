package dk.lycans.silverwolfdk.kotlin.tutorials

fun main() {
    val laserPrinter = LaserPrinter("Brother 1234", 15)

    laserPrinter.printModel()
    println("Best selling price for ${laserPrinter.modelName} is ${laserPrinter.bestSellingPrice()}")

    val something = SomethingElse("Test")
    println(something.number2)

}

abstract class Printer(val modelName: String) {

    open fun printModel() = println("The model name of this printer is $modelName")


    abstract fun bestSellingPrice(): Double

}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {
    final override fun printModel() = println("The model name of this Laser Printer is $modelName")

    override fun bestSellingPrice(): Double = 129.99
}

class SpecialLaserPrinter(modelName: String, ppm: Int): LaserPrinter(modelName, ppm) {

}

open class Something: MySubInterface {
    override fun myFunction(str: String): String {
        return str.toUpperCase()
    }

    override fun mySubFunction(str: String): String {
        return str.toLowerCase()
    }
    
    override val number: Int = 25

    val someProperty: String

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parents constructor")
    }
}

class SomethingElse: Something {

    constructor(someOtherParameter: String): super(someOtherParameter) {
        println("I'm in the child's constructor.")
    }
}

interface MyInterface {

    val number: Int
    val number2: Int
        get() = number * 25

    fun myFunction(str: String): String

}

interface MySubInterface: MyInterface {
    fun mySubFunction(str: String): String
}