// ========================================================
// Java Program - Methods (Functions)
// Description   : Demonstrates method definition, parameters,
//                 return types, and method calling.
// ========================================================

class Computer {

    // ------------------- Method 1 (void) -------------------
    // Method with no return value
    public void playMusic() {
        System.out.println("Music playing...");
    }

    // ------------------- Method 2 (with return + parameter) -------------------
    // Method takes input (parameter) and returns a value
    public String getMeAPen(int cost) {

        if (cost >= 10) {
            return "Pen";                 // return value
        }

        return "Nothing";                 // default return
    }
}

public class MethodsExample {

    public static void main(String[] args) {

        // ------------------- Object Creation -------------------
        Computer obj = new Computer();

        // ------------------- Method Call (void) -------------------
        obj.playMusic();

        // ------------------- Method Call (with return) -------------------
        String result = obj.getMeAPen(12);
        System.out.println(result);

        // ------------------- Method Syntax -------------------
        // access_modifier return_type method_name(parameters) {
        //     statements;
        //     return value; (if not void)
        // }

        // ------------------- Key Concept -------------------
        // Method = behavior of an object
        // Class  = blueprint
        // Object = instance that uses methods

        // ------------------- Method Components -------------------
        // 1. Access Modifier → public, private, etc.
        // 2. Return Type → void, int, String, etc.
        // 3. Method Name → descriptive action name
        // 4. Parameters → input values

        // ------------------- Return Keyword -------------------
        // return sends value back to caller
        // Once return executes → method stops immediately

        // ------------------- Advantages -------------------
        // 1. Code reusability (write once, use many times)
        // 2. Improves readability and modularity
        // 3. Makes debugging easier
        // 4. Reduces code duplication

        // ------------------- Disadvantages -------------------
        // 1. Too many methods may make code complex
        // 2. Improper design can reduce readability
        // 3. Slight overhead in method calls

        // ------------------- Expected Output -------------------
        // Music playing...
        // Pen

    }
}
