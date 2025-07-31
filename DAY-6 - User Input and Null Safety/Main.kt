//====================================== Learning Section 1 ========================================

// In many applications, especially console-based ones, you need to get input from the user.
// Kotlin provides simple ways to read text that the user types into the console.

// key functions
// 1. readlnOrNull()
// 2. readline() or readln()


fun main () {
    // --- Reading the string ---
    println("Whats is you name ?")
    val name: String? = readlnOrNull() // Read input which may be null

    if (name != null && name.isNotEmpty()) {
        println("Hello, $name")
    } else {
        println("I didn't catch your name.")
    }

    println(" --- Reading and Integer ---")
    println("Please enter your age: ")
    val sgestring: String? = readlnOrNull() // read input as a integer

    //try to convert the string to an int
    val age: Int? = sgestring?.toIntOrNull() // if agestring is null, this whole expression become null
                                            // If agestring is not null, toIntOrNull() is called

    if (age != null) println("You are $age years old") else
        println("That doesn't seem likea valid age.")

    println(" --- Reading a double ---")
    println("enter a price for an item: ")
    val price: Double? = readlnOrNull()?.toDoubleOrNull()

    if (price != null) {
        val pricewithtax = price * 1.07
        println("The price with tax is $pricewithtax")
    } else {
        println("Invalid price entered.")
    }
}
fun main () {


    //One of the most common pitfalls in many programming languages (like Java) is the infamous
    // NullPointerException (NPE). It occurs when you try to access a member
    // (like a property or method) of a variable that currently holds no reference,
    // i.e., it's null.

    // 1. Kotlin's Approach: Nullability in the Type System
    var name: String = "Alice"
    //name = null // compile time error! 'name' cannot be null.

    // 2. Nullable Types (?)
    var nullablename: String? = "Bob"
    nullablename = null

    var age: Int = 30
    var nullableage: Int? = age //this is fine
    var nullableage1 : Int? = null // this is also fine

    // 3. Safe Calls (?.)
    val lengthornulln: Int? = nullablename?.length
    println(lengthornulln)

    // Safe calls can be chained:
// user?.profile?.address?.street
// If user, or profile, or address is null, the whole expression becomes null.

    // 4. Elvis Operator (?:)
    val nametodisplay: String = nullablename ?: "Guest" // If nullableName is null, use "Guest"
    println(nametodisplay) //If nullableName was "Bob", prints "Bob". If null, prints "Guest".

    val len: Int = nullablename?.length ?: 0 // If nullableName or its length is null, len becomes 0

    // 5. Non-Null Asserted Call (!!) - Use with Extreme Caution!
    //val definitelength: Int = nullablename!!.length // If nullableName IS null,
                                                    // this WILL throw an NPE!

    // 6. Safe Casts (as?)
   val somevalue: Any = "I am a String"
    val strvalue: String? = somevalue as? String // works , returns "I am a String"
    val intvlue: Int? = somevalue as? Int // returns null
    println("$intvlue")
    //val anothervalue: Int = somevalue as Int // throws an exception
   // println("$anothervalue")

    // 7. Scope Functions for Null Checks (especially let)
    var email: String? = "user@example.com"
    //email = null

    email?.let { e -> println("Sending email to $e")  // This block won't execute if email is null")
    } ?: run {
    println("No email is provided")
    }

    val resultlength: Int? = email?.let {
        println("Precessing email: $it")
        it.length
    }
    println("Length of the email from let is $resultlength")
}





//==================================================================================================

//====================================== Practise Section 1 ========================================

fun main () {
    println("Whats your favorite color ?")
    var favcolor: String? = readlnOrNull()

    println("Whats your favourite number ?")
    var favnum: String? = readlnOrNull()

    var number: Int? = favnum?.toIntOrNull()


    if (favcolor != null) {
        if (favcolor.isEmpty()) {
            println("Hmm, you didn't enter a color")
            favcolor = "Unknown"
        }
    } else {
        println("Hmm, I think you didn't enter a color")
        favcolor = "Unknown"
    }

    if (favnum == null) {println("Hmm, $favnum doesn't look like a valid number")
        number = 0 }

    println("So, your favorite color is $favcolor and your favorite number is $number. Interesting")


}


fun calculateCakeprice(numberOfToppings: Int, specialmessagetext: String?,
                       isWeekend: Boolean): Double {

    // Define constants for clarity
    val baseCakePrice = 20.00
    val costPerTopping = 2.50
    val specialMessageCost = 5.00
    val weekendSurchargeRate = 0.15 // 15%

    var currentTotal = baseCakePrice
    currentTotal += numberOfToppings * costPerTopping


    var specialmessage: String?= specialmessagetext

    if (!specialmessagetext.isNullOrEmpty()) {
        currentTotal += specialMessageCost
    }

    val finalTotal = if (isWeekend) {

        val surcharge = currentTotal * weekendSurchargeRate
        currentTotal + surcharge
    } else {

        currentTotal
    }

    println("Base cake price: $baseCakePrice")
    println("Number of toppings: $numberOfToppings")
    if (specialmessagetext.isNullOrEmpty()) {
        println("No special message provided (or message was empty/null).")
    } else {
        println("Special message: \"$specialmessagetext\" (Cost: $specialMessageCost)")
    }
    if (isWeekend) println("Weekend surcharge: $weekendSurchargeRate") else
        println("No weekend surcharge")
    println("Final total: $finalTotal")
    println("----------------------------------")

    return finalTotal
}
fun main() {
    calculateCakeprice(7,"Happy Birthday",true)
    calculateCakeprice(0,"",false)
    calculateCakeprice(9,null,true)
}


//==================================================================================================