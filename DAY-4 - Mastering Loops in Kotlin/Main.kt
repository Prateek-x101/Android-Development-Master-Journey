fun main ()
{


//===============================Learning with example==============================================

    //The for Loop: the for loop in Kotlin is excellent for iterating over things that can
    // be stepped through one item at a time. The simplest and most common use case to
    // start with is iterating over ranges of numbers.

    println("Starting loop...")
    for (i in 1..3) {
        println("Current number is: $i")
    }
    println("Loop finished!")

    //Kotlin ranges flexibility with for loops

    //(a) until - Excluding the End Value If you want to iterate up to,
    // but not include, the end value of a range.

    println("Using 'until':")
    for (i in 1 until 5) {//Iterates for i = 1, 2, 3, 4 (5 is excluded)
        println("i is $i")
    }

    //(b) downTo - Counting Downwards To iterate from a higher number to a lower one.

    println("Using 'downTo':")
    for (count in 10 downTo 7) { // do reverse counting from higher to lower.
        println("Countdown: $count")
    }

    //(c) step - Controlling the Increment/Decrement To skip values or count
    // by a specific increment.

    println("Using 'step':")
    for (num in 0..10 step 2) {  //0, 2, 4, 6 ,8, 10
        println("Even number: $num")
    }

    println("\n Using 'step' (counting down):")
    for (num1 in 9 downTo 0 step 3 ) { // 9, 6, 3, 0
        println("Decrementing by 3: $num1")
    }


//==================================================================================================


//================================Practise Section 1 ===============================================

    println("Starts")
    for (i in 1..5) {
        println("The is repetition number $i ")
    }
    println("Ends")


    println("Odd number between 1-10")
    for (i in 1..10 step 2) {
        println("$i")
    }

    println("Countdown begin!!")
    for (i in 3 downTo 1) {
        println("$i")
    }
    println("Liftoff!")

    // Experiments
    for (i in 5..1) {
        println("$i")
    }
    //nothing happens not even error nor any output

    val start = 1
    val end = 5
    val increment = 2

    for (i in start..end step increment) {
        println("$i")

    }

    // works just like with out initialization with variable declaration

//==================================================================================================


//===============================Learning with example 2============================================

    // While loop :While for loops are excellent for iterating a known number
    // of times (like through a range or a collection), while loops
    // are used when you want to repeat a block of code as long as a
    // certain condition remains true. You don't necessarily know in
    // advance how many times the loop will run.

    var count = 1 // Initialize the counter
     println("Starting while loop...")
    while (count <= 3) {  // Loop as long as count is less than or equal to 3
        println("Current count is $count")
        count++ // Increment the counter
    }
    println("While loop finished!")

    //Note: With while loops, it's critical that something inside the loop
    // eventually makes the condition false. If the condition
    // always stays true, you create an infinite loop, and
    // your program will get stuck running that
    // loop forever (or until you manually stop it).

    //Conceptual example - actual input reading is more involved

var userinput = ""
while (userinput != "quit") {
    println("Enter something (or 'quit' to exit) : ")
    // In a real program, you'd read user input here and assign it to userInput
    // For this example, let's simulate it
    if (userinput == "") userinput = "hello" // Replace with actual user input
    else if (userinput == "hello") userinput = "world" // stimulate second input
    else if (userinput == "world") userinput = "quit" // stimulate typing quit to exit

    println("You entered: $userinput")
    if (userinput == "quit")
        println("Exiting...")
}
    println("Program ended.")


    //Loop control statements
    // 1. break: Immediately terminates the innermost loop it's
    // currently in (for, while, or do-while).
    // Execution continues at the statement immediately following the terminated loop.

    for(i in 1..10) {
        if (i ==5) {
            println("Found 5, Breaking the loop")
            break // exits for loop
        }
        println("i is $i")
    }
    println("Loop finished")


    //continue : Skips the rest of the current iteration of the
    // innermost loop.•Execution jumps to the beginning of
    // the next iteration (for for loops, it moves to the
    // next item; for while loops, it re-evaluates the condition).

    for (i in 1..5) {
        if ( i == 3) {
            println("skipping 3.")
            continue // skips the rest of the current iteration.
        }
        println("i is $i")
    }
    println("Loop finished")

    //d0-while : The do-while loop is similar to the while loop,
    // but with a crucial difference: the code block within
    // a do-while loop is always executed at least once before
    // the condition is checked.

    var count = 1
    println("using do-while:")
    do{
        println("count is $count")
        count++
    } while (count <= 3) // Will print for 1, 2, 3


    println("\n If count at 5 (fo do-while): ")
    var anothercount = 5
    do{
        println("AnotherCount is: $anothercount") // this will print once
        anothercount++
    } while (anothercount <= 3) // Condition (6 <= 3) is false, loop stops
                                // But the block already ran once!


    println("\n For comparison, a while loop with the same output:")
    var whilecount = 5
    while (whilecount <= 3) {// this condition is already false so loop stops
        println("Whilcount is: $whilecount") // this will never run

        println("While loop with whilecount = 5 did execute its body")
    }

//==================================================================================================


//================================Practise Section 2================================================

    var countDown = 5
    println("Starting countdown....")
    while (countDown != 0) {
        println("T-Minus $countDown")
        countDown--

    }
    println("Blast OFF!!!")



    var stimulatedchoise = ""
    var attemptstoexit = 0
    println("Demonstrating do-while for menu (Stimulated-output): ")

    do{
        println("\n----Stimulated Menu----")
        println("1. Start Game")
        println("2. View High Scores")
        println("3. Exit")

        attemptstoexit++
        stimulatedchoise = when (attemptstoexit) {
            1 -> "1"
            2 -> "2"
            else -> "3"
        }
        println("Simulated user choise: $stimulatedchoise")

        when (stimulatedchoise) {
            "1" -> println(">>>>Action: Starting game<<<<")
            "2" -> println(">>>>Action: Viewing high scores<<<<")
            "3" -> println(">>>>Action: Exiting<<<<")
            else -> println(">>>>Action: Invalid choice<<<<")
        }

    } while (stimulatedchoise != "3")
    println("\nExiting menu demo.")




//==================================================================================================


}