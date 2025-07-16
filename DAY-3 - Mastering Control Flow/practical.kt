fun main ()
{
// Day 4 pre-logic session
    val height = 8
    val width = 9

    val area = height * width
    val perimeter = (2 * (height + width))
    val issquare: Boolean = height == width

    println(" Height = $height \n Width = $width \n Area of a rectangle is $area \n perimeter of rectangle is $perimeter \n Is figure a square ? : $issquare" )
//pre-logic session end

// Day 4 Post-logic session

    val username = "Prateek"
    val userage = 19
    val isstudent = true
    val monthlyspend = 2500.00

    val agegroup = when (userage) {
        in 0..12 -> "Child"
        in 13..19 -> "Teenager"
        in 20..35 -> "Young Adult"
        in 36..49 -> "Adult"
        else -> "Senior citizen"
    }

    val spendinghabit = if (monthlyspend <= 500.00){
        "Low spender"
    } else if (monthlyspend in (501.00..1500.00)) {
        "Moderate spender"
    } else {
        "High spender"
    }

    val discountmessage = if ((isstudent == true) && (userage in 18..25)) {
        "Eligible for student discount"
    } else {
        "Not eligible for student discount"
    }

    println("USERNAME : $username")
    println("AGE : $userage")
    println("AGE CATEGORY : $agegroup")
    println("SPENDING HABIT : $spendinghabit")
    println("DISCOUNT STATUS: $discountmessage")


//post-logic session end

}