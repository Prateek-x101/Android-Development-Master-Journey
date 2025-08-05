// Pre-Day logic session

fun getDisplayNickname(nickname: String?): String {
    // Problem:
    // 1. If 'nickname' is null, calling nickname.isEmpty() would crash without Kotlin's specific null handling for platform types (which is advanced).
    //    For a pure Kotlin String?, it would be a compile error or require a safe call.
    //    Let's assume we want to fix this to be robust for any String?.
    // 2. If 'nickname' is null, the concatenation "Nickname: " + nickname results in "Nickname: null", which isn't user-friendly.
    // 3. It doesn't correctly handle an empty string ("") to display "No nickname set."

    if (nickname.isNullOrEmpty()) { // Handles null, but not empty string for the desired message
        return "No nickname set." // This will print "Nickname: null"
    } else {
    return "Nickname: " + nickname
 }
}

fun main() {
    println("--- Pre-Day Logic Session: Fix the Nickname Display ---")

    val user1Nickname: String? = "RockstarDev"
    val user2Nickname: String? = null
    val user3Nickname: String? = "" // Empty string

    println("User 1: " + getDisplayNickname(user1Nickname)) // Expected: Nickname: RockstarDev
    println("User 2: " + getDisplayNickname(user2Nickname)) // Expected: No nickname set.
    println("User 3: " + getDisplayNickname(user3Nickname)) // Expected: No nickname set.
    println("----------------------------------------------------")
}
// Pre-day logic session ends here

// Post-day Logic session

fun main () {
    val pricelist = mutableListOf<Double>()
    println("How many items would you like to have? :")
    val numberofitems = readlnOrNull()?.toIntOrNull()
    if (numberofitems != null) {
        for (i in 1..numberofitems) {
            println("Enter the price of item $i:")
            val itemprice = readlnOrNull()?.toDoubleOrNull() ?: 0.0
            pricelist.add(itemprice)
        }
    }else {
        println("Invalid Input for number of items")
        }

    println("--------------------------------------")
    println("Price List:")
    for (price in pricelist) {
        println("Price: $price")
    }
    val totalprice = pricelist.sum()
    println("Total Price: $totalprice")
    val maxprice = pricelist.maxOrNull()
    println("Max Price: $maxprice")
    println("--------------------------------------")
}




// Post-day Logic session ends here