# Day 4: Mastering Loops in Kotlin

## Focus:
Deep dive into Kotlin's iterative control flow structures: `for`, `while`, and `do-while` loops. Understanding their syntax, use cases, and how to control loop execution.

## Key Concepts Covered:

1.  **`for` Loops:**
    *   Iterating over ranges (`1..5`).
    *   Using `until` for exclusive upper bounds.
    *   Using `downTo` for reverse iteration.
    *   Using `step` to control iteration increments/decrements.
    *   Practical application in number sequences and simple repetitions.

2.  **`while` Loops:**
    *   Condition-based iteration: loop continues as long as a condition is true.
    *   Importance of ensuring the condition eventually becomes false to avoid infinite loops.
    *   Initializing and updating counter/control variables.
    *   Application in scenarios where the number of iterations isn't known beforehand (e.g., guessing game).

3.  **`do-while` Loops:**
    *   Guaranteed execution of the loop body at least once.
    *   Condition is checked *after* the loop body executes.
    *   Useful for scenarios like input validation or menu-driven programs where an action must be performed before checking if it needs to be repeated.
    *   Practiced with a simulated menu example.

4.  **Loop Control (Briefly Touched):**
    *   `break`: Used to exit a loop prematurely. (Practiced in guessing game logic).
    *   `continue`: (Mentioned) Skips the current iteration and proceeds to the next.

## Exercises & Challenges:

*   **For Loop Practice:** Various exercises with ranges, `step`, `downTo`.
*   **While Loop Practice:** Countdown timer.
*   **Post-Logic Session (Guessing Game):**
    *   Initial implementation using nested conditional logic.
    *   Refactored to a standard `while` loop structure for better clarity and scalability.
    *   Implicit use of `break` logic by setting attempt counters to exit.
*   **Do-While Menu Challenge:** Implemented a simulated menu system to demonstrate `do-while` behavior.

## Learnings & Takeaways:

*   Gained a solid understanding of how and when to use Kotlin's different loop types.
*   Developed skills in controlling loop flow and structuring iterative logic.
*   The `do-while` loop provides a useful pattern for "act first, then check condition" scenarios.
*   Refactoring code (like the guessing game) is important for clarity and maintainability.

## Next Steps (Day 6 Preview):
*   Further refinement of the guessing game (adding more feedback, exploring explicit `break`).
*   Introduction to **Functions** in Kotlin.
