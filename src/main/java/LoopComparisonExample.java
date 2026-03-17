// ========================================================
// Java Program - For vs While vs Do-While
// Description   : Demonstrates differences between loops
//                 and when to use each type.
// ========================================================

public class LoopComparisonExample {

    public static void main(String[] args) {

        // ------------------- FOR LOOP -------------------
        // Best when number of iterations is known

        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop count: " + i);
        }

        // ------------------- WHILE LOOP -------------------
        // Best when number of iterations is NOT known

        int j = 1;
        while (j <= 5) {
            System.out.println("While Loop count: " + j);
            j++;
        }

        // ------------------- DO-WHILE LOOP -------------------
        // Executes at least once even if condition is false

        int k = 10;
        do {
            System.out.println("Do-While executed once");
            k++;
        } while (k <= 5);

        // ------------------- Key Differences -------------------
        // for loop     → initialization, condition, increment in one line
        // while loop   → condition checked before execution
        // do-while     → condition checked after execution

        // ------------------- When to Use -------------------
        // for loop:
        // Use when number of iterations is known
        // Example → printing 1 to 100

        // while loop:
        // Use when condition decides execution
        // Example → reading file/data until end

        // do-while loop:
        // Use when code must run at least once
        // Example → menu-driven programs

        // ------------------- Advantages -------------------
        // For Loop:
        // 1. Compact and structured
        // 2. Best for fixed iterations

        // While Loop:
        // 1. Flexible for unknown conditions
        // 2. Useful for real-time data processing

        // Do-While Loop:
        // 1. Guarantees at least one execution
        // 2. Useful for user input scenarios

        // ------------------- Disadvantages -------------------
        // For Loop:
        // 1. Not suitable for unknown iterations

        // While Loop:
        // 1. Risk of infinite loop if condition not updated

        // Do-While Loop:
        // 1. Executes once even if condition is false
        // 2. Less commonly used

        // ------------------- Frequency -------------------
        // For Loop     → Most commonly used
        // While Loop   → Used in files, DB, streams
        // Do-While     → Rare use cases

        // ------------------- Expected Output -------------------
        // For Loop count: 1 to 5
        // While Loop count: 1 to 5
        // Do-While executed once

    }
}
