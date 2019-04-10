/**
 * Whenever you write a Kotlin application, you must add a function to it called main,
 * which starts your application. When you run your code, the JVM looks for this function,
 * and executes it.
 *
 * From Kotlin1.3, however, you can omit main’s parameters so that the
 * function looks like this
 * */

fun main() {
    print("Pow!")
}
/**
 * val vs. var revisited If you declare the variable using val, the reference to
 * the object stays in the variable forever and can’t be replaced. But if you
 * use the var keyword instead, you can assign another value to the variable.
 * */

fun variableSample(){

    var x = 5
    val fName = "Avinash"

/**
 * If the integer you assign is too large to fit into an Int, it will use a Long
 * instead. You will also create a Long object and variable if you add an “L” to
 * the end of the integer
 * */

    var hugeNumber = 6L

/**
 * There are two basic floating-point types: Float and Double. Floats can hold 32 bits,
 * whereas Doubles can hold 64 bits.
 * */

    var y = 123.5

/**
 * Boolean variables are used for values that can either be true or false.
 * You create a Boolean object and variable if you declare a variable using
 * code like this:
 * */

    var isBarking = true
    var isTrained = false


/**
 * Characters and StringsThere are two more basic types: Char and String.
 * Char variables are used for single characters. You create a Char variable
 * by assigning a character in single quotes.
 *
 * */
    var letter = 'D'

/**
 * String variables are used to hold multiple characters strung together.
 * You create a String variable by assigning the characters enclosed in double quotes
 * */
    var name = "Fido"

/**
 * How to explicitly declare a variable’s type
 * */

    var smallNum: Short


/**
 * Declaring the type AND assigning a value
 * The above examples create variables without assigning values to them.
 * If you want to explicitly declare a variable’s type and assign a value to it,
 * you can do that too.
 * */
    var z: Short = 6

/**
 * How to convert a numeric value to another type
 * we want to assign the value of an Int variable to a Long. Every numeric
 * object has a function called toLong(), which takes the object’s value, and
 * uses it to create a new Long object. So if you want to assign the value of
 * an Int variable to a Long
 * */

    var a = 5
    var b: Long = a.toLong()

/**
 * When you declare a variable using val, you’re telling the compiler that you want to
 * create a variable that can’t be reused for other values. But this instruction only applies
 * to the variable itself. If the variable holds a reference to an array, the items in the array
 * can still be updated.
 * */

    val myArray = arrayOf(1,2,3)
    myArray[2] = 6


}