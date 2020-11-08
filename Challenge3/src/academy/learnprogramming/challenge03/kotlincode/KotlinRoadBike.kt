package academy.learnprogramming.challenge03.kotlincode

class KotlinRoadBike(cadence: Int, speed: Int, gear: Int = 10, val tireWidth: Int): KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("This road bike has a tire width of ${tireWidth}mm.")
    }
}