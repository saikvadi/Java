// ========================================================
// Java Program - Class and Object Basics
// Description   : Demonstrates the relationship between
//                 class (blueprint) and object (instance).
// ========================================================

class Calculator {                          // Class (Blueprint)

    // ------------------- Properties -------------------
    int a;                                  // Data / attribute
    int b;

    // ------------------- Behavior -------------------
    int add() {                             // Method (action)
        return a + b;
    }
}

public class ClassObjectExample {

    public static void main(String[] args) {

        // ------------------- Object Creation -------------------
        Calculator calc = new Calculator(); // Object (instance of class)

        // Assign values to properties
        calc.a = 5;
        calc.b = 7;

        // Call behavior (method)
        int result = calc.add();

        System.out.println("Result: " + result);

        // ------------------- Key Concept -------------------
        // Class → Blueprint / design
        // Object → Real instance created from class

        // ------------------- Real World Mapping -------------------
        // Object has:
        // 1. Properties → What it has (data)
        // 2. Behavior   → What it does (methods)

        // Example:
        // Calculator → class
        // calc       → object

        // ------------------- Memory Concept -------------------
        // Object is created in heap memory using 'new' keyword
        // JVM allocates memory and returns reference

        // ------------------- Advantages -------------------
        // 1. Helps organize code using real-world modeling
        // 2. Improves reusability
        // 3. Makes code modular and easy to maintain
        // 4. Foundation for OOP concepts (inheritance, polymorphism)

        // ------------------- Disadvantages -------------------
        // 1. Slightly complex for beginners
        // 2. Requires proper design thinking
        // 3. More code compared to simple procedural approach

        // ------------------- Expected Output -------------------
        // Result: 12

    }
}
