//==================================== Learning With Example =======================================

// Kotlin provides a few ways to create loops. The most common one you'll use for repeating
// a specific number of times, or for going through a collection of items (which we'll learn
// about next!), is the for loop.

fun main () {
    for (i in 1..5) {                       // this is range represents 1, 2, 3, 4, 5
        println("this is repetition number: $i")
    }
}

// Another common for loop usage: Counting down

fun main () {
    for (i in 5 downTo 1) {
        println("Countdown: $i")
    }
    println("Blast off!")
}

// Sometimes, you don't know exactly how many times you need to loop beforehand. Instead,
// you want to keep looping as long as a certain condition is true. For this, we use a while loop.

fun main () {
    var attempts = 0
    var guessedcorrectly = false

    while (!guessedcorrectly && attempts < 3) {
        println("Attempt #${attempts + 1}: Guess the secret number (1-5):")
        val input = readlnOrNull()?.toIntOrNull()
        attempts++

        if (input == 3) {
            println("Congratulations! You guessed it.")
            guessedcorrectly = true
        } else {
            println("Sorry, Wrong guess.")
            if (attempts >= 3)
                println("You've run out of attempts! The correct answer was 3. ")
        }
    }
    println("Game over.")
}

// Introducing the List
// A List in Kotlin is an ordered collection of items. "Ordered" means that the items stay
// in the same sequence you put them in. Think of it like a numbered list on a piece of paper.

fun main () {
    val fruits: List<String> = listOf("Apple", "Banana", "Cherry")
    val firstfruit = fruits[0]
    println("First fruit: $firstfruit") // output first fruit apple

    val secondfruit = fruits[1]
    println("Second fruit: $secondfruit")

    //val outofbound = fruits[3]
    //println("test non existing fruit: $outofbound")

    println("Number of fruits: ${fruits.size}")


    val numbers = listOf(1, 2, 3, 4, 5)
    println("Number of numbers: ${numbers.size}")
    

    var emptyList = listOf<Any>()

    val colors = listOf("Red", "Green", "Blue", "Yellow")

    println("----My favorite colors----")
    for (color in colors) {
        println(color)
    }
    println("--------------------------")

    val animals = listOf("Cat", "Dog", "Elephant", "Fish")
    for ((index, animal) in animals.withIndex()){
        println("Animal at index ${index + 1} is: $animal")
    }

    println("Please enter the index number between 1 and ${animals.size}")
    var enterindexpoint: Int? = readlnOrNull()?.toIntOrNull()
    val range: Boolean = enterindexpoint in 1..animals.size
    if (enterindexpoint != null) {
        if (range == true) {
            println("Animal at index $enterindexpoint is: ${animals[enterindexpoint - 1]}")
        } else {
            println("Index number doesn't exist")
        }
    } else {
        println("Invalid input")
    }
}


//==================================================================================================

//====================================== Practice Section ==========================================

fun main () {
    val movies = listOf("The Shawshank Redemption", "The Godfather", "The Dark Knight", "Pulp Fiction")
    println("My favorite movies:")
    for (movie in movies) {
        println("$movie")
    }
}

//==================================================================================================

//==================================== Learning With Example =======================================
//==================================================================================================

//====================================== Practice section ==========================================
//==================================================================================================

