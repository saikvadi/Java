// ========================================================
// Java Program - For Loop Example
// Description   : Demonstrates basic and nested for loops
//                 with counting and real-world example.
// ========================================================

public class ForLoopExample {

    public static void main(String[] args) {

        // ------------------- For Loop Syntax -------------------
        // for(initialization; condition; increment/decrement) {
        //     statements;
        // }

        // ------------------- Basic For Loop -------------------
        for (int i = 1; i <= 4; i++) {
            System.out.println("Hi " + i);
        }

        // ------------------- Loop Logic -------------------
        // 1. Initialization → runs once at the beginning
        // 2. Condition → checked before every iteration
        // 3. Increment → runs after each iteration

        // ------------------- Zero-Based Counting -------------------
        // Computers usually start from 0
        // Example:
        for (int i = 0; i < 4; i++) {
            System.out.println("Count " + i);
        }

        // ------------------- Reverse Loop -------------------
        // Loop can also run backward
        for (int i = 4; i >= 1; i--) {
            System.out.println("Reverse " + i);
        }

        // ------------------- Nested For Loop -------------------
        // Outer loop → Days
        // Inner loop → Hours

        for (int i = 1; i <= 5; i++) {
            System.out.println("Day " + i);

            for (int j = 1; j <= 9; j++) {
                System.out.println("    " + (j + 8) + " - " + (j + 9));
            }
        }

        // ------------------- Key Concept -------------------
        // For loop is best when number of iterations is known.
        // It combines initialization, condition, and increment in one line.

        // ------------------- Advantages -------------------
        // 1. Compact and readable syntax
        // 2. Best when number of iterations is known
        // 3. Reduces chances of forgetting increment/decrement
        // 4. Easy to manage loop variables

        // ------------------- Disadvantages -------------------
        // 1. Not ideal when number of iterations is unknown
        // 2. Can become complex with nested loops
        // 3. Less flexible compared to while loop in some cases

        // ------------------- Comparison with While -------------------
        // while loop:
        // Initialization, condition, increment are separate

        // for loop:
        // All three are in one line → more structured

        // ------------------- Expected Output -------------------
        // Hi 1
        // Hi 2
        // Hi 3
        // Hi 4
        // (followed by other loop outputs)

    }
}
