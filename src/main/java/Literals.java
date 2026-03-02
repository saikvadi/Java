/*
 * Program Name: LiteralsDemo.java
 * Description: This program demonstrates all types of literals in Java.
 * Author: Your Name
 */

public class Literals {

    public static void main(String[] args) {

        // ===============================
        // 1. INTEGER LITERALS
        // ===============================

        int decimal = 100;       // Decimal (Base 10)
        int binary = 0b1010;     // Binary (Base 2)
        int octal = 012;         // Octal (Base 8)
        int hex = 0x1A;          // Hexadecimal (Base 16)

        System.out.println("---- Integer Literals ----");
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);


        // ===============================
        // 2. FLOATING-POINT LITERALS
        // ===============================

        float floatValue = 10.5f;    // 'f' suffix required for float
        double doubleValue = 20.99;  // Default type is double

        System.out.println("\n---- Floating-Point Literals ----");
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);


        // ===============================
        // 3. CHARACTER LITERALS
        // ===============================

        char letter = 'A';         // Single character
        char digit = '1';          // Character digit
        char symbol = '@';         // Special symbol
        char unicodeChar = '\u0041'; // Unicode representation of 'A'

        System.out.println("\n---- Character Literals ----");
        System.out.println("Letter: " + letter);
        System.out.println("Digit: " + digit);
        System.out.println("Symbol: " + symbol);
        System.out.println("Unicode Character: " + unicodeChar);


        // ===============================
        // 4. STRING LITERALS
        // ===============================

        String name = "Java Playlist Telusuko";
        String message = "Hello World";

        System.out.println("\n---- String Literals ----");
        System.out.println("Name: " + name);
        System.out.println("Message: " + message);


        // ===============================
        // 5. BOOLEAN LITERALS
        // ===============================

        boolean isJavaFun = true;
        boolean isSkyGreen = false;

        System.out.println("\n---- Boolean Literals ----");
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Is Sky Green? " + isSkyGreen);


        // ===============================
        // 6. NULL LITERAL
        // ===============================

        String data = null;  // Null literal (only for reference types)

        System.out.println("\n---- Null Literal ----");
        System.out.println("Data value: " + data);
    }
}
