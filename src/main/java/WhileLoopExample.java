// ========================================================
// Java Program - While Loop Example
// Description   : Demonstrates how a while loop works,
//                 including a nested while loop.
// ========================================================

public class WhileLoopExample {

    public static void main(String[] args) {

        // ------------------- Basic While Loop -------------------
        // Syntax:
        // while(condition) {
        //     statements;
        // }

        int i = 1;                                  // Initialization

        while (i <= 4) {                             // Condition
            System.out.println("Hi " + i);            // Statement executed repeatedly
            i++;                                      // Increment
        }

        System.out.println("Bye " + i);               // i becomes 5 when loop ends

        // ------------------- Loop Logic -------------------
        // Every loop needs three things:
        // 1. Initialization → starting value (i = 1)
        // 2. Condition → when to continue/stop (i <= 4)
        // 3. Increment/Decrement → move to next iteration (i++)

        // ------------------- Nested While Loop Example -------------------
        // A nested loop means placing one loop inside another loop.

        int x = 1;

        while (x <= 4) {                              // Outer loop
            System.out.println("Hi " + x);

            int y = 1;                                // Reset inner counter

            while (y <= 3) {                          // Inner loop
                System.out.println("Hello " + y);
                y++;
            }

            x++;
        }

        // ------------------- Key Concept -------------------
        // The inner loop runs completely for each iteration of the outer loop.

        // Example Flow:
        // Hi 1
        // Hello 1
        // Hello 2
        // Hello 3
        // Hi 2
        // Hello 1
        // Hello 2
        // Hello 3
        // ... continues

        // ------------------- Important -------------------
        // If the condition never becomes false, the loop becomes an infinite loop.
        // Example:
        // while(true) { ... }

        // ------------------- Advantages -------------------
        // 1. Avoids writing repetitive code
        // 2. Good when the number of iterations is not known beforehand
        // 3. Simple and easy to understand

        // ------------------- Disadvantages -------------------
        // 1. Infinite loops may occur if increment/decrement is missing
        // 2. Harder to manage when loops become deeply nested
        // 3. Sometimes less readable than a for loop

        // ------------------- Expected Output -------------------
        // Hi 1
        // Hi 2
        // Hi 3
        // Hi 4
        // Bye 5
        // (followed by nested loop output)

    }
}
