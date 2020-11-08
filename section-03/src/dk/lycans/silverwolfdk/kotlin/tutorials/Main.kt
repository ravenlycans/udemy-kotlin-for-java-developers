package dk.lycans.silverwolfdk.kotlin.tutorials


typealias EmployeeSet = Set<Employee>

fun main() {
    var number = 10;

    val employees: EmployeeSet

    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"

//    println(employee1.name)

    val employee2: Employee
    val number2 = 100
    if (number < number2) {
        employee2 = Employee("Mark Jones", 150)
    } else {
        employee2 = Employee("Mark Smith", 200)
    }

    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)

    println(employeeOne === employeeTwo)
    println(employeeTwo === employeeThree)
    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree)

    val employeeFour = employeeTwo
    println(employeeFour === employeeTwo)

    println(employeeFour != employeeTwo)
    println(employeeFour !== employeeTwo)
    println(employeeTwo != employeeThree)
    println(employeeTwo !== employeeThree)

    val x = 0x00101101
    val y = 0x11011011

    val xY = x or y
    val yX = x and y

    val something: Any = employeeFour

    if (something is Employee) {
        // Smart casting.
        println("Something is an Employee: ${something.name}")
    } else {
        println("Something is not an Employee")
    }

    println(employeeFour)

    val change = 4.22
    println("To show the value of change, we use \$change")
    println("The value of \$change is $$change")

    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator / denominator}")

    // Raw strings.
    val eggName = "Humpty"
    val nurseryRhyme = """
        $eggName Dumpty sat on the wall.
        $eggName Dumpty had a great fall
        All the king's horses and all the king's men.
        Couldn't put $eggName together again.
    """.trimIndent()

    println(nurseryRhyme)
}


class Employee(var name: String, val id: Int) {

    override fun equals(other: Any?): Boolean {
        if (other is Employee) {
            return name == other.name && id == other.id
        }

        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }


}