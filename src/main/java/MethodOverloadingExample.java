// ========================================================
   Java Program - Method Overloading
// Description   : Demonstrates multiple methods with the
//                 same name but different parameters.
// ========================================================

class Calculator {

    // ------------------- Method 1 -------------------
    // Adds two integers
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // ------------------- Method 2 -------------------
    // Adds three integers (different number of parameters)
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // ------------------- Method 3 -------------------
    // Adds two double values (different data types)
    public double add(double n1, double n2) {
        return n1 + n2;
    }
}

public class MethodOverloadingExample {

    public static void main(String[] args) {

        // ------------------- Object Creation -------------------
        Calculator obj = new Calculator();

        // ------------------- Method Calls -------------------
        int r1 = obj.add(3, 4);          // Calls method with 2 int parameters
        int r2 = obj.add(3, 4, 5);       // Calls method with 3 int parameters
        double r3 = obj.add(3.5, 4.5);   // Calls method with double parameters

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        // ------------------- Key Concept -------------------
        // Method Overloading → Same method name, different parameters

        // ------------------- Rules -------------------
        // Method signature must be different:
        // 1. Change number of parameters
        // 2. OR change type of parameters

        // Not allowed:
        // Changing only return type is NOT valid

        // Example (INVALID):
        // int add(int a, int b)
        // double add(int a, int b)  → Compilation error

        // ------------------- Why Use -------------------
        // Avoids multiple method names for same logic
        // Improves readability and consistency

        // ------------------- Advantages -------------------
        // 1. Increases code readability
        // 2. Same method name for similar operations
        // 3. Improves code organization
        // 4. Reduces confusion in naming methods

        // ------------------- Disadvantages -------------------
        // 1. Too many overloaded methods can confuse beginners
        // 2. Harder to debug if not properly structured
        // 3. Can reduce readability if overused

        // ------------------- Expected Output -------------------
        // 7
        // 12
        // 8.0

    }
}
