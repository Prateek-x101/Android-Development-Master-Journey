import kotlinx.coroutines.selects.selectUnbiased

// Pre-Day Logic Session

fun calculateCakePrice(numberOfToppings: Int, hasSpecialMessage: Boolean, isWeekend: Boolean): Double {

    // Define constants for clarity
    val baseCakePrice = 20.00
    val costPerTopping = 2.50
    val specialMessageCost = 5.00
    val weekendSurchargeRate = 0.15 // 15%

    var currentTotal = baseCakePrice
    currentTotal += numberOfToppings * costPerTopping
    if (hasSpecialMessage) {
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
    if (hasSpecialMessage) println("Special message cost: $specialMessageCost") else
        println("No special message")
    if (isWeekend) println("Weekend surcharge: $weekendSurchargeRate") else
        println("No weekend surcharge")
    println("Final total: $finalTotal")
    println("----------------------------------")

    return finalTotal
}


fun main () {
    calculateCakePrice(5,false, false)
    calculateCakePrice(0,true,false)
    calculateCakePrice(9,true,true)
}





// Pre-Day Logic Session ends here

// Post-Day Logic Session

fun calculatedicountcakeprice (basecakeprice: Double= 20.00, toppingscost:Double=2.50,
                                    spcialmessagecost:Double=5.00,weekendsupercharge:Double=0.15,
                                   loyaltydiscount:Double=0.10,largeorderdiscount:Double=0.05) :Double {

    println("How many toppings would you like?")
    var toppingsinput: Int? = readlnOrNull()?.toIntOrNull()
    if (toppingsinput == null) {
        println("Oops! The input is invalid please try again! \nInitialized as 0")
        toppingsinput = 0
    } else if (toppingsinput < 0) {
        toppingsinput = 0
        println("Dude it should be a positive number!")
    }

    println("Enter your special message (leave blank if none):")
    var specialmessageinput: String? = readlnOrNull()
    val message: Boolean = if (specialmessageinput == null) {
        println("Oops! The input is invalid Unable to catch the Message!")
        specialmessageinput = "--No special message provided by user--"
        false
    } else if (specialmessageinput.isEmpty()) {
        specialmessageinput = "--No special message provided by user--"
        false
    } else {
        true
    }
    println("The special message entered is $specialmessageinput")

    println("Is this for a  weekend (yes/no)? Note: Empty field or wrong input will considered as 'no'!")
    var weekendinput: String? = readlnOrNull()?.toLowerCase()
    val weekend: Boolean = if (weekendinput.isNullOrEmpty()) {
        println("The input should be 'yes' or 'no'. '\n' Please try again!!")
        false
    }else if (weekendinput == "yes") {
        true
    } else if (weekendinput == "no") {
        false
    } else {
        println("The input should be 'yes' or 'no'. \nPlease try next time!!")
        false
    }


    println("Are you a loyalty club member (yes/no)? Note: Empty or wrong field will considered as 'no'!")
    var loyaltyinput: String? = readln().toLowerCase()
    var member: Boolean = if (loyaltyinput.isNullOrEmpty()){
        println("Input should be 'yes' or 'no' \nPlease try next time!!")
        loyaltyinput = "no"
        false
    } else if (loyaltyinput == "yes") {
        true
    } else if (loyaltyinput == "no") {
        false
    } else {
        println("Input should be 'yes' or 'no' \nPlease try next time!!")
        loyaltyinput = "no"
        false
    }


    var currenttotal = 0.00
    var Subtotal: Double = currenttotal
    var grandtotal = Subtotal

    println("Base cake Price: $$basecakeprice")
    currenttotal = currenttotal + basecakeprice
    println("Toppings ($toppingsinput x $$toppingscost): $${toppingscost * toppingsinput}")
    currenttotal = currenttotal + (toppingscost * toppingsinput)
    println("Special message ($specialmessageinput): $$spcialmessagecost")
    if ( message == false) {
        currenttotal
    } else {
        currenttotal = currenttotal + spcialmessagecost
    }
    println("SUBTOTAL BEFORE DISCOUNT: $$currenttotal")
    var loyaldiscount: Double = currenttotal * loyaltydiscount
    if (member == true) {
        currenttotal = currenttotal - loyaldiscount
        println("Loyalty Discount: $$loyaldiscount")
    } else {
        loyaldiscount = 0.00
        println("Loyalty Discount: $$loyaldiscount")
    }

    var largediscount: Double = currenttotal * largeorderdiscount
    if (toppingsinput < 5) {
        largediscount = 0.00
        println("Large order discount ($toppingsinput toppings < 5): $$largediscount")
    } else {
        currenttotal = currenttotal - largediscount
        println("Large order discount ($toppingsinput toppings >= 5): $$largediscount")

    }
    Subtotal = currenttotal
    println("Subtotal after discounts: $$Subtotal")
    var weekenddiscount: Double = currenttotal * weekendsupercharge
    if (weekend == true) {
        currenttotal = currenttotal + weekenddiscount
        println("Weekend Supercharge: $$weekenddiscount")
    } else {
        weekenddiscount = 0.00
        println("Weekend Supercharge: $$weekenddiscount")
    }
    Subtotal = currenttotal
    grandtotal = Subtotal
    println("GRAND TOTAL: $$Subtotal")

    println("----------------------------------")
    return grandtotal
}

fun main () {
    val Grandtotal = calculatedicountcakeprice()
    println("The final amount due for your cake order is: $$Grandtotal")
}

// Post-Day Logic Session ends here

// Refactored post-day logic session

fun calculateDiscountedCakePrice_Refactored(): Double {
    // --- 1. Define Internal Constants ---
    val baseCakePrice = 20.00
    val costPerTopping = 2.50
    val specialMessageCost = 5.00
    val loyaltyDiscountRate = 0.10 // 10%
    val largeOrderDiscountRate = 0.05 // 5%
    val weekendSurchargeRate = 0.15 // 15%
    val largeOrderToppingThreshold = 5

    // --- 2. Get and Sanitize User Input ---
    println("How many toppings would you like?")
    val toppingsInput = readlnOrNull()
    val numberOfToppings = toppingsInput?.toIntOrNull() ?: 0
    if (toppingsInput != null && numberOfToppings == 0 && toppingsInput != "0") {
        println("Invalid number entered. Defaulting to 0 toppings.")
    }

    println("Enter your special message (leave blank if none):")
    val specialMessage = readlnOrNull()

    println("Is this for a weekend (yes/no)?")
    val isWeekend = readlnOrNull()?.equals("yes", ignoreCase = true) ?: false

    println("Are you a loyalty club member (yes/no)?")
    val isLoyaltyMember = readlnOrNull()?.equals("yes", ignoreCase = true) ?: false

    println("\n--- Order Summary ---")

    // --- 3. Calculate Price Sequentially ---
    var total = baseCakePrice
    println("Base Cake Price: $$baseCakePrice")

    total += numberOfToppings * costPerTopping
    println("Toppings Cost ($numberOfToppings x $$costPerTopping): $${numberOfToppings * costPerTopping}")

    if (!specialMessage.isNullOrEmpty()) {
        total += specialMessageCost
        println("Special Message Cost (\"$specialMessage\"): $$specialMessageCost")
    }

    println("Subtotal before discounts: $$total")

    var loyaltyDiscountAmount = 0.0
    if (isLoyaltyMember) {
        loyaltyDiscountAmount = total * loyaltyDiscountRate
        total -= loyaltyDiscountAmount
    }
    println("Loyalty Discount (10%): -$$loyaltyDiscountAmount")

    var largeOrderDiscountAmount = 0.0
    if (numberOfToppings >= largeOrderToppingThreshold) {
        largeOrderDiscountAmount = total * largeOrderDiscountRate
        total -= largeOrderDiscountAmount
    }
    println("Large Order Discount (>= $largeOrderToppingThreshold toppings): -$$largeOrderDiscountAmount")

    println("Subtotal after discounts: $$total")

    var weekendSurchargeAmount = 0.0
    if (isWeekend) {
        weekendSurchargeAmount = total * weekendSurchargeRate
        total += weekendSurchargeAmount
    }
    println("Weekend Surcharge (15%): +$$weekendSurchargeAmount")

    println("-----------------------")
    println("GRAND TOTAL: $$total")
    println("-----------------------")

    return total
}

// Refactored post-day logic session ends here

