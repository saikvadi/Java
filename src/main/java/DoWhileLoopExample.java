// ========================================================
//  Java Program - Do While Loop Example
// Description   : Demonstrates how a do-while loop executes
//                 at least once before checking the condition.
// ========================================================

public class DoWhileLoopExample {

    public static void main(String[] args) {

        // ------------------- Variable -------------------
        int i = 5;                               // Starting value

        // ------------------- Do-While Syntax -------------------
        // do {
        //     statements;
        // } while(condition);

        // ------------------- Example -------------------
        do {
            System.out.println("Hi " + i);        // Executes at least once
            i++;                                  // Increment
        } while (i <= 4);                         // Condition checked after execution

        // ------------------- Key Concept -------------------
        // In a do-while loop, the code block runs first
        // and the condition is checked afterward.

        // This guarantees the loop executes at least one time.

        // ------------------- Difference from While Loop -------------------
        // while loop:
        // Condition checked first → may execute 0 times

        // do-while loop:
        // Executes first → condition checked later → executes at least once

        // ------------------- Example Flow -------------------
        // i = 5
        // Step 1 → Print "Hi 5"
        // Step 2 → i becomes 6
        // Step 3 → Condition checked (6 <= 4 → false)
        // Step 4 → Loop stops

        // ------------------- Advantages -------------------
        // 1. Guarantees at least one execution
        // 2. Useful when the task must run once before checking condition
        // 3. Good for menu-driven programs and user input systems

        // ------------------- Disadvantages -------------------
        // 1. May execute once even when condition is false
        // 2. Can cause logical errors if not used carefully
        // 3. Less commonly used compared to while or for loops

        // ------------------- Important -------------------
        // do-while loop must end with a semicolon (;)

        // ------------------- Expected Output -------------------
        // Hi 5

    }
}
