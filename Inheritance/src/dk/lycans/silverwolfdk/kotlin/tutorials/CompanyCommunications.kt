package dk.lycans.silverwolfdk.kotlin.tutorials

import java.time.Year

// Singleton pattern
object CompanyCommunications {
    private val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."
}

// Factory pattern
class SomeClass private constructor(val someString: String) {

    companion object {
        private var privateVar = 6

        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"
        fun justAssign(str:String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            return if (lowerCase) {
                SomeClass(str.toLowerCase())
            } else {
                SomeClass(str.toUpperCase())
            }
        }
    }
}

// Anonymous objects/classes
interface SomeInterface {
    fun someFunction(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("This is in wantsSomeInterface: ${si.someFunction(22)}")
}

// Enum classes.
enum class Department(private val fullName: String, private val numOfEmployees: Int) {
    HR("Human Resources", 5), IT("Information Technology", 3), SALES("Sales", 20),
    ACCOUNTING("Accounting", 3), LAW("Law", 2);

    fun getDepartmentInfo() = "The $fullName department has $numOfEmployees employees."
}

// Top level function
fun topLevel(str: String) = println("Top level function $str")

// Top level extension function.
fun String.upperFirstAndLast(): String {
    return substring(0, 1).toUpperCase() + substring(1, length - 1) + substring(length - 1, length).toUpperCase()
}

fun main() {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    val someClass1 = SomeClass.justAssign("This is the string, as is.")
    val someClass2 = SomeClass.upperOrLowerCase("This isn't the string, as is.", false)
    println(someClass1.someString)
    println(someClass2.someString)

    // The object: SomeInterface can extend more interfaces, if needed. Just add like this:
    // object: SomeInterface, AnotherInterface
    println(wantsSomeInterface(object: SomeInterface {
        override fun someFunction(num: Int): String {
            return "This is inside anonymous object: ${num * 100}"
        }
    }))

    println(Department.HR.getDepartmentInfo())
    println(Department.SALES.getDepartmentInfo())
    println("this is all lowercase".upperFirstAndLast())

    topLevel("I'm private.")
}