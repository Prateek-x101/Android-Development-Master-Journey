

// Pre-logic session

// Mistakenly erased the code

//Pre-logic session ends here


// Post-Logic session

fun calculateordertotal (Itemname: String, Itemprice: Double, quantity: Int = 0,
                         discountpercentage: Double = 0.00, shippingcost: Double = 0.00):Double {

    val subtotal = Itemprice * quantity
    val discountamount = (subtotal * (discountpercentage / 100))
    val grandtotal = (subtotal - discountamount) + (shippingcost)

    println("Item Name: $Itemname")
    println("Item Price: $Itemprice ")
    println("Quantity: $quantity")
    println("Subtotal: $subtotal")
    println("Discount persentage: $discountpercentage")
    println("Discount Amount: $discountamount")
    if (shippingcost == 0.00) {
        println("Shipping cost : --")
    } else {
        println("Shipping Cost: $shippingcost")
    }
    println("Grand Total: $grandtotal")

    println("----------------------------------------")
    return grandtotal


}

fun main () {
    calculateordertotal(Itemname = "Croissant",Itemprice = 4.00, quantity = 4)
    calculateordertotal(Itemname = "Muffin", Itemprice = 2.00, quantity = 5, discountpercentage =
    10.00)
    calculateordertotal(Itemname = "Cupcake", Itemprice = 3.00, quantity = 2, shippingcost = 20.00,
        discountpercentage = 15.00)
}

// Post-Logic session ends here

