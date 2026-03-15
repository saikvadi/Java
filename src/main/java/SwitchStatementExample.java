// =======================================================
// Java Program - Switch Statement
// Description   : Demonstrates how switch-case selects one
//                 block of code based on a variable value.
// ========================================================

public class SwitchStatementExample {

    public static void main(String[] args) {

        // ------------------- Variable -------------------
        int n = 2; // Change this value to test different cases

        // ------------------- Switch Syntax -------------------
        // switch(variable){
        //     case value1:
        //         statements;
        //         break;
        //     case value2:
        //         statements;
        //         break;
        //     default:
        //         statements;
        // }

        // ------------------- Example -------------------
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

        // ------------------- Key Concept -------------------
        // switch checks the value of a variable and executes
        // the matching case block.

        // ------------------- Important -------------------
        // break stops execution after a case runs.
        // Without break, Java continues executing the next cases.
        // This is called fall-through.

        // ------------------- Advantages -------------------
        // 1. Cleaner than long if-else chains
        // 2. Easy to read when comparing one variable with many values
        // 3. Better organization for menu or option-based logic

        // ------------------- Disadvantages -------------------
        // 1. Works only with certain data types (int, char, String, enum)
        // 2. Cannot use complex logical conditions
        // 3. Missing break may cause unintended execution

        // ------------------- Expected Output -------------------
        // For n = 2
        // Output → Tuesday

    }
}
