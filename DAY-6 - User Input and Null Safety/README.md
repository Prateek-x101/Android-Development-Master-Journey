# Kotlin Fundamentals: My Learning Journey

This repository documents my progress as I learn the Kotlin programming language, aiming to build a strong foundation for professional Android development. Each day's code, including exercises and challenges, is stored here.

## Day 6: User Input and Null Safety

Today's focus was on building interactive and robust programs. The code in the `/practical.kt` and `/Main.kt` files (specifically from the Post-Day Logic Session) demonstrates a comprehensive command of these critical concepts.

### Concepts Mastered:

1.  **User Input:**
    -   Reading from the console using the safe `readlnOrNull()` function.
    -   Parsing `String` input into other types like `Int` using `toIntOrNull()`, which prevents crashes from invalid user input.

2.  **Kotlin's Null Safety System:**
    -   **Nullable Types (`?`):** Declaring variables that are allowed to hold `null` (e.g., `String?`).
    -   **Safe Call Operator (`?.`):** Safely accessing methods or properties on a nullable variable.
    -   **Elvis Operator (`?:`):** Providing a default value when a nullable expression is `null`. This was used extensively to handle invalid input and provide default values.
    -   **`isNullOrEmpty()`:** The standard, idiomatic way to check if a nullable string is null or empty.

### Featured Project: The Interactive Discount Calculator

The final project for Day  was `calculateDiscountedCakePrice()`, a function that:
-   Prompts the user for multiple inputs (number of toppings, special message, weekend order, loyalty status).
-   Safely handles invalid or missing inputs.
-   Calculates a base price.
-   Sequentially applies multiple conditional discounts and a final surcharge.
-   Prints a detailed, step-by-step breakdown of the final bill.

This project is a practical demonstration of combining variables, control flow (`if/else`), user input, and null safety to create a functional and robust console application.

### How to Run the Code

1.  Ensure you have a Kotlin environment set up (e.g., via IntelliJ IDEA or Android Studio).
2.  Navigate to the file containing the `main` function for the day's exercises.
3.  Run the `main` function to see the interactive prompts and calculations in the console.

---
*This repository is part of my personal development plan to become a legendary Android developer. Follow along as I continue to learn and build!*