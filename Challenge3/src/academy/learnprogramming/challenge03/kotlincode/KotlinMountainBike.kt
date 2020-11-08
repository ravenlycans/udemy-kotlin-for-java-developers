package academy.learnprogramming.challenge03.kotlincode

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10): KotlinBicycle(cadence, speed, gear) {

    constructor(color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10): this(seatHeight, cadence, speed, gear) {
        println("This mountain bike is $color.")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of ${seatHeight}cm.")
    }

    companion object {
        private val availableColors = arrayListOf("blue", "red", "white", "black", "green", "brown")

        fun getAvailableColors(): String {
            var mountainBikeColors: String = ""
            for (color in availableColors)
                mountainBikeColors += "${color}, "

            mountainBikeColors = mountainBikeColors.substring(0, mountainBikeColors.length - 2)

            return mountainBikeColors
        }
    }
}