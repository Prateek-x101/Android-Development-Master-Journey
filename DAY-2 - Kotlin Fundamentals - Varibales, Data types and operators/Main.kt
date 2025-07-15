fun main ()
{

//============================ Learning with Example Section 1 ====================
    // example of val
    val pi: Double = 3.14159 // Explicitly typed and Initialized by user.
    val appname = "MyAwesomeApp" // Type 'String' is inferred by the compiler automatically.
    val maxUsers = 100

    // Attempting to reassign a 'val' will result in a compile-time error:
    // appname = "MyNewapp"  Error: Val cannot be reassigned.

    println("The value of pi is $pi")
    println("Welcome to $appname. Maximum users: $maxUsers")

    // Example of var
    var currentScore: Int = 0
    println("Initial score: $currentScore")

    currentScore = 10
    println("Updated score: $currentScore")

    var username = "Guest"
    println("Current user: $username")

    username = "Alice"
    println("Current user: $username")

//===============================================================




// ================= Practise Section 1 =======================



    // Variable type val (immutable) cant be assigned new value. Final value
 val name: String = "Prateek" //Explicitly typed and initialized
    val favoritelanguage = "Kotlin" //Type 'string' is inferred by the compiler automatically
    val currentyear = 2025 // Inferred type  'Int'
     println("Hello everyone !! My name is $name. My favorite programming language is $favoritelanguage. And I am learning this language in year $currentyear. \n ~Thank you")

    // Variable type var (mutable) can be assigned new value.
    var taskcount = 0 // Inferred type 'Int'

    println("No. of tasks done: $taskcount") // will print the Initialized vale.
    println("I have finished my homework.")

    taskcount = taskcount + 1  // will adds 1 in Initialized value
    println("No. of task done: $taskcount")

    println("I have played some games after that.")
    taskcount = taskcount + 1  // will add 1 to updated or incremented value.


    println("No. of tasks done: $taskcount")

    //lets try to assign the new value to a val type variable and see whats the harm.
    val testscore = 19

    testscore = 99
    println(testscore)
    // Showing an error in build output saying "'val' cannot be reassigned."



//===============================================================================




//====================== Learning with Example Section 2========================

    //Common kotlin data types (Integers) 32-bits
    //Int: Represent whole numbers
    val age: Int = 19
    val quanity = 100 // type inferred

    //Long: Represents larger whole numbers, 64-bits ,
    // use an 'L' suffix to explicitly denote along.
    val veryLargenNumber: Long = 1234567891011121314L
    val anotherLargenumber = 100L

    //Double: Represents floating-point numbers, Numbers with decimal point,
    //Default type for decimal numbers. 64-bit precision.
    val pi: Double = 3.14159
    val price = 29.99

    // Float: Represents floating-point numbers, less precision than Double.
    // uses an 'F' or an 'f' suffix to explicitly denote along, 32-bit.
    val itemweight: Float = 0.75f
    val taxrate = 0.05F

    //there are other too like
    // * Short: For smaller integers 16-bit
    // * Byte: For very small integers 8-bit
    // Int and Long are used most often

    // Boolean: Represents logical values true or false. Crucial for
    // control flow and logical operators
    val isActive: Boolean = true
    val isloggedin = false

    //Char: Single character or symbols enclosed in single quotes
    val firstInitial: Char = '@'
    val grade = 'A'

    //String = Represents a sequence of characters enclosed in double quotes.
    // Strings are immutable in kotlin (like val variable. Modify a string by
    // creating new object.
    val greeting: String = "Hello, Kotlin!"
    val appname = "My android app"

    /* You initialize a variable later (though this is less common with val).
       The compiler cannot infer it or might infer a type you don't intend
       (e.g., if you want a Float but provide a number like 0.5,
       it defaults to Double unless you add F).*/



//==============================================================================




//======================Practise section 2=====================================

    val CPUcores = 4 // Int type
    val height = 1.75 //Double type
    val hadcoffeetoday = false //Boolean type
    val firstLetterofcity = 'N'
    val message = "Hello, Everyone how is the code file  clean or helpful ?"

    println("In the Initialization the types are as follows: \n Int type: $CPUcores \n Double type: $height" )
    println(" Boolean type: $hadcoffeetoday \n Char type: $firstLetterofcity \n String type: $message")

    // experiments
    var doublevalue: Double = 3.12
    doublevalue = Int
    // the error says: Assignment type mismatch: actual type is 'kotlin.Int.Companion',
    // but 'kotlin.Double' was expected.
    var intvalue: Int = 12
    intvalue = Boolean
    //the error says Assignment type mismatch: actual type is 'kotlin.Boolean.Companion',
    // but 'kotlin.Int' was expected.

    // Error will occurs because we use the unofficial methods there are
    // there are some official methods too do so.



//=============================================================================

//============================Learning with example============================
    //There are very large variety of operators which Kotlin supports.
    // 1. Arithmetic operators
    //used for calculations.

    //Example
    val num1 = 20
    val num2 = 7

    println("$num1 + $num2 = ${num1 + num2}") //performs addition
    println("$num1 - $num2 = ${num1 - num2}") //performs subtraction
    println("$num1 * $num2 = ${num1 * num2}") //performs multiplication
    println("$num1 / $num2 = ${num1 / num2}") //performs division
    println("$num1 % $num2 = ${num1 % num2}") // performs modules

    // for changing type of initialized variable
    val preciseresult = num1.toDouble() / num2
    println("$num1 / $num2  (precise) = $preciseresult")

    // 2. Comparison operators
    // used to compare two values. they return a boolean result true or false

    val score = 85
    val passingscore = 70

    println("Is score equal to passingscore: ${score == passingscore}") //use double equals for comparison
    println("Is score not equals to passingscore? ${score != passingscore}") // not equals to
    println("Did the student pass? ${score >= passingscore}") // Bigger or equals to
    println("Did the student fail ?: ${score <= passingscore}") //lesser or equals to
    println("Is the score perfect (100) ?: ${score == 100}")

    // 3. Logical operators
    // used to combine or modify boolean expressions

    val haspremiumSubscription = true
    val isContentAvailable = false
    val userIsloggenIn = true

    val canAccessFeature = userIsloggenIn && haspremiumSubscription //  && :If both are true return true
    println("Can access premium feature ? $canAccessFeature")

    val canviewcontent = userIsloggenIn && (haspremiumSubscription || isContentAvailable) // || : Returns true if
    println("Can view Content ? $canviewcontent ")                                      // one operand is true

    val needstologin = !userIsloggenIn  // ! : it negates the value like opposite version
    println("Needs to log in ? $needstologin")


//=========================================================================================================



//===========================Practise section 3===============================

    //Arithmetic
    val apples = 5
    val oranges = 6
    val totalfruits = apples + oranges // adds the both fruits quantity or value

    println("No. of apples : $apples")
    println("No. of oranges : $oranges")
    println("Total no. of fruits : $totalfruits")

    val friendsshare = totalfruits / 3    // Distributed the total fruits among 3 friends equally
    val remainingfruits = totalfruits % 3 // calculates the remaining fruit (work like a remainder)
    println("No. of fruits for each friend : $friendsshare")
    println("No. of fruits remaining : $remainingfruits")



    // Comparison and Logical
    val isweekend = false
    val temprature = 28

    val cangotopark = isweekend && (temprature > 20) // will check its a weekend AND temperature is
    println("Can go to park now ? : $cangotopark")  // greater than 20

    val stayindoors  = (isweekend == false)  || (temprature < 10 ) // will check if weekend is false OR
    println("Do i have stay indoors ? : $stayindoors")  // and temperature is less than 10.



    // Experiments
    println("5" + 3) // it will print 53
    println(5 + "3")
    /* Error says None of the following candidates is applicable:
    fun plus(other: Int): Int
    fun plus(other: Byte): Int
    fun plus(other: Double): Double
    fun plus(other: Float): Float
    fun plus(other: Long): Long
    fun plus(other: Short): Int
    */

    val x = 10
    val y = 0
    val safeDiv = (y != 0) && (x / y > 2)
    println(safeDiv)
    // In Kotlin it uses short circuiting for && and || ex if first
    //operand is false, the second operand is not evaluated
    // (because the result will be false anyway).
    // and for ||: If the first operand is true, the second operand is not
    // evaluated (because the result will be true anyway).
    // This can be important if the second operand involves a
    // function call or an operation with side effects.


// If short circuit didn't happen here then the program will throw exception error because
// we in second operand we dividing x= 10 with y = 0 which is undefined cause dividing by 0 is
// undefined in maths.


//============================================================================
}
