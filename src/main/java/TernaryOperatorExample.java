// ========================================================
// Java Program - Using Ternary Operator (Shorthand for if-else)
// Description   : Program demonstrating ternary operator to assign a value
//                 based on a condition.
// ========================================================

public class TernaryOperatorExample {                   // Class name must exactly match the file name

    public static void main(String[] args) {            // Program execution starts here

        // ------------------- Variables -------------------
        int n = 5;                                      // Number to check
        int result = 0;                                 // Variable to store the result

        // ------------------- Ternary Operator Syntax -------------------
        // condition ? value_if_true : value_if_false;

        // Example:
        result = n % 2 == 0 ? 10 : 20;                  // If n is even assign 10 else assign 20

        System.out.println(result);                     // Output result

        // ------------------- Equivalent if-else -------------------
        // if (n % 2 == 0)
        //     result = 10;
        // else
        //     result = 20;

        // ------------------- Advantages -------------------
        // 1. Makes code shorter and cleaner
        // 2. Useful for simple conditions
        // 3. Reduces multiple lines of if-else
        // 4. Improves readability when used properly

        // ------------------- Disadvantages -------------------
        // 1. Hard to read when conditions become complex
        // 2. Nested ternary operators reduce code clarity
        // 3. Not suitable for multiple decision logic
        // 4. Difficult for beginners to understand if overused

        // ------------------- When to Use -------------------
        // Use ternary operator when there are only two possible outcomes
        // Example: finding min, max, even/odd decisions

        // ------------------- Expected Output -------------------
        // For n = 5
        // Output → 20

    }                                                   // End of main method
}                                                       // End of class
