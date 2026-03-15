// ========================================================
// Java Program - Switch Statement Example
// Description   : Demonstrates how switch-case maps a number
//                 (1–7) to the corresponding day of the week.
// ========================================================

public class SwitchExample {                           // Class name must match file name

    public static void main(String[] args) {           // Program execution starts here

        // ------------------- Variable -------------------
        int n = 2;                                     // Change this value (1–7) to test different outputs

        // ------------------- Switch Syntax -------------------
        // switch(variable) {
        //     case value1:
        //         statements
        //         break;
        //     case value2:
        //         statements
        //         break;
        //     default:
        //         statements
        // }

        // ------------------- Switch Example -------------------
        switch (n) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Enter a valid number (1-7)");
        }

        // ------------------- Key Idea -------------------
        // switch compares one variable against multiple constant values.
        // When a matching case is found, that block executes.

        // ------------------- Important -------------------
        // break statement stops execution of the switch block.
        // Without break, Java continues executing the next cases.
        // This behavior is called "fall-through".

        // ------------------- Advantages -------------------
        // 1. Cleaner and more readable than long if-else chains
        // 2. Easier to maintain when checking many fixed values
        // 3. Improves code organization
        // 4. Compiler may optimize switch better than many if-else statements

        // ------------------- Disadvantages -------------------
        // 1. Works only with limited data types (int, char, String, enum)
        // 2. Cannot use complex logical conditions
        // 3. Missing break may cause unexpected fall-through bugs

        // ------------------- When to Use -------------------
        // Use switch when one variable must be compared
        // against multiple constant values.

        // Example:
        // Menu selection
        // Days of week
        // Grade systems
        // Calculator operations

        // ------------------- Expected Output -------------------
        // For n = 2
        // Output → Tuesday

    }                                                   // End of main method
}                                                       // End of class
