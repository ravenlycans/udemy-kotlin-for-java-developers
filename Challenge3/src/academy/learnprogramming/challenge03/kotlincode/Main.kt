package academy.learnprogramming.challenge03.kotlincode

fun main(args: Array<String>) {
    val testBike = KotlinBicycle(10, 0, 1)
    val testMountainBike = KotlinMountainBike(12, 10, 0, 1)
    val testRoadBike = KotlinRoadBike(10, 0, 1, 20)

    testBike.printDescription()
    testMountainBike.printDescription()
    testRoadBike.printDescription()
    println("*******************************************************************************************************")
    val testBike2 = KotlinBicycle(11, 12)
    testBike2.printDescription()
    println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
    val testMountainBike2 = KotlinMountainBike("red", 10, 10, 25)
    testMountainBike2.printDescription()
    println("This mountain bike comes in the following colors: ")
    println(KotlinMountainBike.getAvailableColors())
    println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
    val testRoadBike2 = KotlinRoadBike(10, 25, 10, 25)
    testRoadBike2.printDescription()
    println("*******************************************************************************************************")
}