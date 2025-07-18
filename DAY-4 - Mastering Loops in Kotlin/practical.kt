fun main ()
{

// Day - 4 Prelogic session
val book = "The kotlin Adventure"
val isbookfeatured = false
    val isbookfictioned = true

    val messagetoprint = if (isbookfeatured == true && isbookfictioned == true) {
        "ERROR : Book status is ambiguous"
    } else if (isbookfeatured == true && isbookfictioned == false) {
        "The Kotlin Adventure is in the featured section."
    } else if (isbookfeatured == false && isbookfictioned == true) {
        "The Kotlin Adventure is in the fictioned section."
    } else {
        "The Kotlin Adventure is in another section."
    }
println("$messagetoprint")


// Pre logic session ends here


// Day - 4 Post logic session

    val secretnumber = 7
    var allowedattempts = 3
    var numberguessed:Int = 0

    println("Guess the secret number between 1-10 \n You will get 3 attempts only")
    while (allowedattempts != 0) {
        println("Type the number: ")

        if (numberguessed == 0) {
            numberguessed = 2
            allowedattempts--
            println("Number typed is $numberguessed")
        }

        if (numberguessed == secretnumber) {
            allowedattempts = 0
        } else if (numberguessed != secretnumber) {

            println("Wrong guess, you have $allowedattempts attempts left")
            numberguessed = 7
            println("Number typed is $numberguessed")
            allowedattempts--
        }else if (numberguessed == secretnumber) {
            println("Correct guess")
            allowedattempts = 0
        } else if (numberguessed != secretnumber) {
            numberguessed = 9
            println("Number typed is $numberguessed")
            println("Wrong guess, you have $allowedattempts attempts left")
            allowedattempts--

        } else if (numberguessed == secretnumber) {
            println("Correct guess")
            allowedattempts = 0
        } else {
            println("Wrong guess")
        }

        if (allowedattempts == 0) {
            println("You have no attempts left")
            println("Better luck next time!")
        }

        }


    // fixed and correct logic


    val secretnumber = 7
    var attemptsallowed = 3
    var attemptsmade = 0
    var guessedcorreclty = false

    println("Guess the secret number between 1-10  \n You will get $attemptsallowed attempts only")
    while (attemptsmade < attemptsallowed && !guessedcorreclty) {
        println("--------------------------------------------")
        println("Attempt ${attemptsmade + 1} of $attemptsallowed")
        println("Type your guess: ")

        val numberguessed: Int? = when (attemptsmade) {
            0 -> 2
            1 -> 4
            2 -> 9
            else -> null
        }
        println("Simulated guess :$numberguessed")
        attemptsmade++

        if (numberguessed == secretnumber) {
            println(">>>> Correct guess congratulations <<<<")
            println("In you ${attemptsmade } attempts")
            guessedcorreclty = true
        } else {
            println(">>>>Wrong guess<<<<")
            if (attemptsmade < attemptsallowed) {
                println("You have ${attemptsallowed - attemptsmade} attempts left.")
            }
        }
    }
    println("-------------------------------")
    if (guessedcorreclty == true) {
        println("You found the secret number ")
    } else {
        println("You have no attempts left")
        println("the secret number was $secretnumber")
    }
println("Game Over!")





// Post logic session ends here

}