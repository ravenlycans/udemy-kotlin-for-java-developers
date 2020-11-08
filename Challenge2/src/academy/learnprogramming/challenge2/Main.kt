package academy.learnprogramming.challenge2

fun main() {
    // 1. Declare a non-nullable float variable in two ways.
    // and assign it the value -3847,384
    val myFloat = -3847.384f
    val myFloat2 = (-3847.384).toFloat()


    // 2. Now change both of those variables declarations into nullable variables.
    val myFloat3: Float? = -3847.384f
    val myFloat4: Float? = (-3847.384).toFloat()


    // 3. Now declare an array of type non-nullable Short. Make it size 5, and assign it the values
    // 1, 2, 3, 4 and 5.
    val myShortArray = arrayOf<Short>(1, 2, 3, 4, 5)

    // 4. Now declare an array of nullable Ints and initialize it with the values
    // 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 etc. all the way up to 200.
    val theFiveStepTable = Array<Int?>(40) { i -> (i + 1) * 5}
    for (element in theFiveStepTable)
        println(element)

    // 5. You have to call a Java method with the following signature from Kotlin:
    // public void method1(char[] charArray). Declare an array that you cloud
    // pass to the method and initialize it with the values 'a', 'b' and 'c'
    val myCharArray = charArrayOf('a', 'b', 'c')


    // 6. Given the following code:
    val x: String? = "I AM IN UPPERCASE"
    // Using one line of code, declare another string variable,
    // and assign it x.toLowerCase() when x isn't null,
    // and the string "I give up!" when x is null.
    val myX = x?.toLowerCase() ?: "I give up!"

    println (myX)

    // 7. Now use the let function to (a) lowercase the string, and then
    // (b) replace "am" with "am not" in the result.
    x?.let {println(it.toLowerCase().replace("am", "am not")) }


    // 8. You're really, really confident. that the variable myNonNullVariable can't contain null.
    // Change the following code to assert that myNoneNullVariable isn't null
    // (and shoot yourself in the foot)
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()


}