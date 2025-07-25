
//==============================Learning with Example===============================================

    // Function : A function is a block of code that performs a
    // specific task. You give it a name, and then you can "call"
    // (or "invoke") that name to execute the code inside it.

/*
fun(to define a function) sayhello (to name the function) () -> (to define the function parameters)
{ (to define the function body)
    println("Hello, Kotlin World!")
}
 
function name : can be anything
parameters : can be the datatypes of the parameters 
mutliple paramters : separated by coma , .

 */



fun sayhello ()
{
    println("Hello, Kotlin World!")
}

fun showwelcomemessage ()
{
    println("-------------------------")
    println("WELCOME TO KOTLIN BAKERY!")
    println("-------------------------")
}


fun functioname (paraname: String , paraname2 : Int)
{
    println("The first paramter is $paraname")
    println("The second parameter is $paraname2")
}


fun main()
{
    sayhello()
    showwelcomemessage()
    functioname("Hello" , 42)


}


// Advanced Parameter Features (20-30 minutes)Kotlin provides some nice features for
// function parameters that can make your functions more flexible to call and easier
// to read: Default Arguments and Named Arguments.

// a) Default Arguments
// Sometimes, a function parameter has a common or default value that's used most of a function
// that takes Int parameters:

fun greet (name: String , greeting: String = "Hello") {
    println("$greeting, $name")
}

fun main () {
    greet("Alice")
    greet("Bob", "Hi")
}

// Example

fun sendnotification (message: String, recipient: String = "User", priority: Int = 1,
                      playsound: Boolean = true) {
    println("TO : $recipient")
    println("Priority : $priority")
    println("Message : $message")
    if (playsound) {
        println("Playing sound")
    } else {
        println("Sound not playing")
    }
    println("--------")
}
fun main () {
    sendnotification("System update available")

    sendnotification("Meeting reminder", priority = 5)

    sendnotification("Silent alert")
}

// b) Named Arguments
// When a function has multiple parameters, especially if several have default
// values or are of the same type, it can sometimes be confusing to remember
// the correct order of arguments when calling the function.

// Named arguments allow you to specify the name of the parameter
// you are providing a value for when you call the function.
// This makes the function call more readable and allows you
// to provide arguments in any order, as long as all required parameters
// (those without defaults) are eventually provided.

fun main() {
    // Using named arguments - order doesn't matter
    sendnotification(
        message = "Your order has shipped!",
        recipient = "Alice"
    )

    // Mixing named and positional arguments (positional must come first)
    // Here, we provide 'message' positionally, and the rest by name.
    sendnotification(
        "Low disk space warning",
        priority = 5,
        playsound = false
    )

    // Using named arguments to skip default parameters clearly
    sendnotification(
        message = "Silent update applied",
        playsound = false
    )

    // All arguments by name for maximum clarity
    sendnotification(
        recipient = "SecurityTeam",
        message = "Unusual login attempt detected",
        priority = 10,
        playsound = true
    )
}






//==================================================================================================

//======================================Practise Section 1==========================================

fun greetyserbyname (name: String)
{
    println("Hello! $name Welcome!")
}


fun addtwonumbers (num1: Int , num2: Int)
{
    val sum = num1 + num2
    println("The sum of two numbers is $sum")
}

fun displayitemcost (itemname: String , cost: Double)
{
    println("The cost of $itemname is $cost")
}


fun main () {
    greetyserbyname("Alice")
    greetyserbyname("Bob")
    addtwonumbers(5,6)
    addtwonumbers(11, 17)
    displayitemcost("Croissant" , 2.00)
    displayitemcost("Muffin" , 3.00)
    greetyserbyname("Bob")
}



fun configureuserprofile (
    username: String ,
    bio: String = "No bio provided",
    profilepictureurl : String = "default_avatar.png",
    notificationenabled: Boolean = true ,
    theme: String = "Light"
) {
    println("Setting up profile for : $username")
    println("Bio : $bio")
    println("Avatar : $profilepictureurl")
    if (notificationenabled) {
        println("Notification: On")
    } else {
        println("Notification: Off")
    }
    println("Theme: $theme")
    println("------------------------------------------------")
}

fun main () {
    configureuserprofile("DevEloper","Android enthusiast | Kotlin Lover",
        notificationenabled = false, theme = "Dark")
    configureuserprofile("UXGuru" )
    configureuserprofile("QA_Specialist", profilepictureurl = "inspector_badge.png",
        notificationenabled = true, )


}




//==================================================================================================





//======================================Learning with example 2=====================================

// return types and return keyword : So far, our functions have performed
// actions (like printing to the console) but haven't given any data
// back to the part of the code that called them. Often, we want a
// function to compute a value and then return that value so it can be
// stored in a variable or used in further calculations.Specifying a
// Return Type: You tell Kotlin what type of data a function will return
// by adding a colon (:) and the data type after the parentheses in the
// function definition.


fun calculatesum (num1 : Int , num2 : Int): Int {
    val sum = num1 + num2
    return sum
}

fun main () {
    val myresult = calculatesum(5,10)

    println("The sum is $myresult")

    val doubleresult = myresult * 2
    println("If I double the sum, I get: $doubleresult")

    println("Another sum ${calculatesum(7,3)}")
}

//  Why is this "giving back" so important?
//  1.Reusability in Different Contexts:•The calculateSum worker doesn't
//  care why you need the sum. It just calculates and returns it.•You can
//  use this sum to update inventory, print a bill, check if a target is
//  met, etc. The function remains the same simple, reliable worker.

fun istotalsufficient (amountneeded: Int, amountavailable : Int) : Boolean { // gives value in // Boolean
    return amountavailable >= amountneeded                                   // boolean.
}

fun main () {
    val itemcost = calculatesum(20,35)
    val moneyinwallet = 50

    val canafford = istotalsufficient(itemcost, moneyinwallet) // calling the function

    if (canafford) {
        println("You can afford this item!")
    } else {
        println("Oops you need ${itemcost-moneyinwallet} more")
    }
}

// Single Expression Functions:
//•Conciseness: They make simple functions shorter and often easier to read at a glance.
//•return is Implicit: You don't use the return keyword; the result of the expression
// after the = is automatically returned.
// •Return Type Inference (Often): If the return type can be clearly inferred by the
// compiler from the expression, you often don't even need to declare it explicitly.

//expression body
fun addNumbers(a: Int, b: Int): Int = a + b
fun isEven(number: Int): Boolean = number % 2 == 0
fun getGreeting(): String = "Hello, there!"

//Expression Body with Type Inference
fun addNumbers2(a: Int, b: Int) = a + b
fun isEven2(number: Int) = number % 2 == 0
fun getGreeting2() = "Hello, there!"





//==================================================================================================



//=====================================Practise section 2===========================================

fun iseven (number: Int) : Boolean {
    val  isiteven = (number % 2 == 0)
    return isiteven
}

fun main () {
    val numbertocheck = 1
    val result = iseven(numbertocheck)
    println("Is the number even : $result")
}

fun multiply(x: Double, y: Double): Double {
    return x * y
}

fun findStringLength(text: String): Int {
    val length = text.length
    return length
}

fun isAdult(age: Int): Boolean {
    return age >= 18
}


//==================================================================================================
