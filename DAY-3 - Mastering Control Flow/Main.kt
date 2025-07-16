fun main ()
{ /*
//================================Learning with Example=============================================

    // If statement : This is the simplest form. If the condition is true,
    // the code block inside the if is executed.


    val temprature = 30
    if (temprature > 25) // checking condition
    {  // performs given actions if condition is true
        println("It's a warm day! ")
    }

    val isRaining = false
    if (isRaining) {
        println("Bring an umbrella.") // this wont print because isRaining is false
    }

    // If-else statement : If you want to do one thing if the condition is true,
    // and another thing if it's false.

    val age = 17
    if (age >= 18) {
        println("You are an adult.")
    } else {
        println("You are a minor.")
    }

    // If-else-if-else statement : You can chain multiple conditions.
    // The first one that evaluates to true gets its block executed.
    // If none are true, the final else block (if present) is executed.

    val score = 85
    if (score >= 90) {
        println("Grade: A")
    } else if (score >= 80) {
        println("Grade: B")
    } else if (score >= 70) {
        println("Grade: C")
    } else {
        println("Grade: F")

    }

    // If as an expression : Because if is an expression,
    // you can assign its result directly to a variable.
    // The value of the last expression in the chosen block becomes
    // the value of the if expression.

    val a = 10
    val b = 20

    val maxval = if (a > b) { // can express in initialization
        println("a is greater")
        a // this will assign the value to maxval if a > b
    } else {
        println("b is grater or equal")
        b // this will assign the value to maxval if b > a
    }
    println("The maximum value is : $maxval")

    //simple one line expression in a block
    val minvalue = if ( a < b) a else b
    println("The minimum value is $minvalue")

    //Note : When using if as an expression
    // (i.e., assigning its result), the else branch is mandatory


    // If with In operator : You can use the in operator
    // for checking ranges or membership in collections.

    val number = 7
    if (number in 1..10) {  // 1..10 is the range of Int defined.
        println("$number is in the range of 1-10")
    }

    val char = 'c'
    if (char in 'a'..'z') {  // a .. z is the range of alphabet a to z defined.
        println("$char is a lowercase letter ")
    }


//==================================================================================================

//===============================Practise Section 1=================================================

    var userage = 19
    if (userage <= 13) {                    // userage is lesser or equal to 13 for child check
        println("Child ticket: $5")
    } else if (userage in 13..60) {   // userage is in range between 13 to 60 for adult check
        println("Adult ticket: $10.")
    } else if (userage  > 60 ) {               // userage is greater than 60 for senior citizen.
        println("Senior ticket: $7")
    }

    userage = 65                              // change in age
    if (userage <= 13) {
        println("Child ticket: $5")
    } else if (userage in 13..60) {
        println("Adult ticket: $10.")
    } else if (userage  > 60 ) {
        println("Senior ticket: $7")
    }

    userage = 35                        // change in age
    if (userage <= 13) {
        println("Child ticket: $5")
    } else if (userage in 13..60) {
        println("Adult ticket: $10.")
    } else if (userage  > 60 ) {
        println("Senior ticket: $7")
    }


    val number2 = 31
    var numdescription  = if (number2 == 0) {
        "Zero"
    } else {
        if (number2 >= 0) {  // if number is lesser than 0 means positive
            "Positive"
        }else {              // if greater than means negative.
            "Negative"
        }
    }

    println("The number is $numdescription")



//==================================================================================================



//=================================Learning with example============================================


    // When statement in kotlin is like a switch : It matches its argument against
    // all branches sequentially until some branch condition is satisfied.

    val dayofweek = 3
    println("-----BASIC WHEN-----")
    when (dayofweek) {            // setting what to count or shose case we have to check
        1 -> println("Monday")      //
        2 -> println("Tuesday")     //
        3 -> println("Wednesday")   //
        4 -> println("Thursday")    //  all this are cases of dayofweek
        5 -> println("Friday")      //
        6 -> println("Saturday")    //
        7 -> println("Sunday")      //
        else -> println("Invalid day") //optional
    }

    val dayofweek2 = 6
    println("-----WHEN WITH COMBINED VALUES-----")
    when(dayofweek2) {
        1 -> println("Start of the work week")
        2, 3, 4 -> println("Mid-week")  // multiple condtion check in one place and same response
        5 -> println("Almost weekend")
        6 -> println("weekend")
        else -> println("Invalid day")
    }

    val numericGrade = 85
    println("-----WHEN WITH 'in' RANGE-----")
    when (numericGrade) {
        in 90..100 -> println("GRADE : A")
        in 80..89 -> println("GRADE : B")
        in 70..79 -> println("GRADE : C")
        in 60..69 -> println("GRADE : D")
        else -> println("GRADE : F")
    }

    val item = "Apple"
    val fruits = listOf("Apple" , "Banana" , "Orange")  // listOf used create a list t
                                                        // ype data structure
    println("-----WHEN WITH 'in' COLLECTION-----")
    when (item) {
        in fruits -> println("$item is a fruit")
        else -> println("$item is not a recognised fruit.")
    }

    val x: Any = "Hell0" // Any is the root of the kotlin class hierarchy.

    println("-----WHEN WITH 'is' TYPE CHECK-----")
    when (x) {
        is String -> println("It's s String with length ${x.length}") // smart cast: x is
                                                                    //treated as String
                                                                    // and .length wll tell length
                                                                    // of the string
        is Int -> println("It is an Int with value $x")       //You can check the type of the when
        is Boolean -> println("It's a Boolean $x")            //argument. This often works with
        else -> println("Unknown type")                         // smart casting.
    }

    val a = 10
    val b = 20

    println("-----WHEN WITHOUT ARGUMENT-----") //works as if-else if chain(simple boolean expression)
                                            // but more cleaner way
    when {
        (a > b) ->println("$a is greater than $b")
        (a < b) ->println("$a is less than $b")
        else -> println("$a is equal to $b")

    }

    // when as an expression
    val statuscode = 200
    val message = when (statuscode) {  // like if else as an expression
        200 -> "OK"
        400 -> "Bad request"
        404 -> "Not found"
        500 -> "Internal Server Error"
        else -> "Unknown status"
    }
    println("HTTP Status: $message")

    val number = 12
    val description = when {
        number % 3 == 0 && number % 5 == 0 -> "FizzBuzz"
        number % 3 == 0 -> "Fizz"
        number % 5 == 0 -> "Buzz"
        else -> number.toString()
    }
    println("$number is $description")

*/
//==================================================================================================

//=================================Practise Section 2===============================================

    val inputnumber = 9
    val description = when (inputnumber){
        1 -> ("One")
        2 -> ("two")
        3 -> ("three")
        in 4..10 -> ("Between Four to Ten")
        else -> ("Unknown number")
    }
    println("The input number is $description")



    val lightcolor: String = "RED"
    val action = when (lightcolor) {
        "RED" -> "Stop"
        "YELLOW" -> "Slow"
        "GREEN" -> "Go"
        else -> "Invalid Light color"

    }

    println("The color is $lightcolor You must $action")




//==================================================================================================
}