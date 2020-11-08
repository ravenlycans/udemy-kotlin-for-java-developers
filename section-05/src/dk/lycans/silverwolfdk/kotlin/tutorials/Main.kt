package dk.lycans.silverwolfdk.kotlin.tutorials

const val MY_CONSTANT = 100

fun main() {
    // visibility modifiers
    // Top level default visibility is public.

    val emp = Employee("Kim")
    val emp2 = Employee("Jan")
    val emp3 = Employee("Jane", false)

    emp.fullTime = false

    println(emp.firstName)
    println(emp.fullTime)
    println(emp2.firstName)
    println(emp2.fullTime)
    println(emp3.firstName)
    println(emp3.fullTime)

    println(Demo().dummy)
    println(MY_CONSTANT)

    val myCar = Car("Red", "Land Rover", 1978)
    val myCar2 = Car("Blue", "Toyota", 2015)
    val myCar3 = myCar.copy()
    val myCar4 = myCar.copy(color = "Yellow", year = 2018)

    println(myCar)
    println(myCar2 == myCar)
    println(myCar == myCar3)
    println(myCar3)
    println(myCar4)

    println(labelMultiply(3, 4))

    println(emp.upperCaseFirstName())

    printCarColors(myCar, myCar2, myCar3, myCar4, before = "The car's color is: ")

    val manyCars = arrayOf(myCar, myCar2, myCar3, myCar4)
    val moreCars = arrayOf(Car("Black", "Test", 9873), Car("Red", "Mazda", 2000))
    val myCar5 = myCar3.copy()
    val lotsOfCars = arrayOf(*manyCars, *moreCars, myCar5)

    printCarColors(*manyCars, before = "The car's color is: ", after = ", cool eh!!")

    for (c in lotsOfCars) {
        println(c)
    }

    println("this is all lowercase".upperFirstAndLast())
}

fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0, 1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length -1, upperFirst.length).toUpperCase()
}

inline fun labelMultiply(operand1: Int, operand2: Int, label: String = "The Answer is:") =
        "$label ${operand1 * operand2}"

fun printCarColors(vararg cars: Car, before: String = "", after: String = "") {
    for (car in cars) {
        println("$before${car.color}$after")
    }
}

class Employee (val firstName: String, fullTime: Boolean = true) {

    var fullTime = fullTime
    get() {
        println("Running the custom get.")
        return field
    }
    set(value) {
        println("Running the custom set.")
        field = value
    }

    fun upperCaseFirstName() = firstName.toUpperCase()

}

class Demo {
    val dummy: String = "Hello"
}

data class Car(val color: String, val model: String, val year: Int) {

}
