## README: Kotlin Learning Journey - Day 7 Progress

**Focus of Day 7: Handling Collections of Data with Loops and Lists**

Today marked significant progress in understanding how to manage and iterate over collections of
data in Kotlin. The core concepts covered were fundamental looping structures and the versatile `List` collection type.

### Key Concepts Covered:

1.  **Loops for Repetition:**
    *   **`for` Loops:**
        *   Iterating over ranges (e.g., `1..5`, `5 downTo 1`).
        *   Iterating through collections (e.g., `for (item in myList)`).
        *   Iterating with index and value using `list.withIndex()`.
    *   **`while` Loops:**
        *   Executing blocks of code as long as a specified condition remains true.
        *   Importance of ensuring an exit condition to prevent infinite loops.

2.  **Lists for Storing Ordered Data:**
    *   **`List<T>`:** Introduced as an ordered collection of items of a specific type `T`.
    *   **`listOf<T>()`:** Creating immutable (read-only) lists.
    *   **`mutableListOf<T>()`:** Creating mutable lists, allowing addition of elements (e.g., using `.add()`).
    *   Accessing elements by index (e.g.,
`myList[0]`).
    *   Getting list size with `.size`.
    *   Useful built-in functions for lists of numbers:
        *   `.sum()`: Calculates the sum of elements.
        *   `.maxOrNull()`: Finds the maximum element (or `null` if the list is empty).

### Practical Application & Exercises:

*   **Pre-Day Logic Session:**
    *   Refined the `getDisplayNickname` function using `isNullOrEmpty()` to robustly handle `null` and empty string inputs, reinforcing Day 6's null-safety concepts.
*   **Favorite Movies Exercise:**
    *   Created an immutable `List` of favorite movie titles.
    *   Used a `for` loop to iterate through the list and print each movie.
*   **Post-Day Logic Session (Shopping Cart Challenge):**
    *   Developed a simple interactive shopping cart application.
    *   Prompted the user for the number of items and their prices.
    *   Stored prices in a `mutableListOf<Double>`.
    *   Calculated and displayed the total price (using `.sum()`) and the most expensive item (using `.maxOrNull()`).
    *   Handled user input for numbers using `readlnOrNull()?.toIntOrNull()` and `readlnOrNull()?.toDoubleOrNull()`, including basic error handling with default values (`?:`).

### Outcome:

Successfully implemented solutions for all exercises, demonstrating a solid understanding of how to use loops to control program flow and lists to manage collections of data. Confident in using `for` and `while` loops, creating both immutable and mutable lists, and applying common list operations.

**Next Steps:** Continue exploring Kotlin's collection framework, focusing on `Maps` and other useful collection functions on Day 8.
