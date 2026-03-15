// ========================================================
// Java Program - Introduction to Loops
// Description   : Demonstrates why loops are needed and
//                 how a while loop repeats a task.
// ========================================================

public class LoopIntroductionExample {

    public static void main(String[] args) {

        // ------------------- Problem Without Loop -------------------
        // If we want to print "Hi" four times manually:

        // System.out.println("Hi");
        // System.out.println("Hi");
        // System.out.println("Hi");
        // System.out.println("Hi");

        // This creates repetitive code and is inefficient.

        // ------------------- Loop Example (While Loop) -------------------
        int i = 1;                       // Initialization (starting point)

        while (i <= 4) {                 // Condition (loop runs while this is true)
            System.out.println("Hi");    // Statement to repeat
            i++;                         // Increment (moves loop toward stopping condition)
        }

        // ------------------- Loop Logic -------------------
        // Every loop generally needs three parts:
        // 1. Initialization → starting value
        // 2. Condition → when to continue/stop
        // 3. Increment/Decrement → move to next iteration

        // ------------------- Types of Loops in Java -------------------
        // 1. while loop     → used when repetition depends on a condition
        // 2. do-while loop  → executes at least once before checking condition
        // 3. for loop       → used when number of iterations is known

        // ------------------- Advantages -------------------
        // 1. Avoids repetitive code
        // 2. Makes programs shorter and cleaner
        // 3. Useful for repeating tasks many times
        // 4. Helps process large data sets efficiently

        // ------------------- Disadvantages -------------------
        // 1. Infinite loops can occur if condition never becomes false
        // 2. Hard to debug if loop logic is incorrect
        // 3. Poorly written loops may reduce readability

        // ------------------- Expected Output -------------------
        // Hi
        // Hi
        // Hi
        // Hi

    }
}
