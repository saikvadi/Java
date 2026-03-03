/**
 * Type Conversion & Casting in Java (summary of Telusko video #8)
 * 
 * Key concepts demonstrated:
 * 1. Implicit (automatic/widening) casting   → smaller → larger type (no data loss)
 * 2. Explicit (manual/narrowing) casting     → larger → smaller type (possible data loss)
 * 3. Type promotion during arithmetic operations
 * 
 * Compile and run to see all behaviors at once.
 */
public class TypeConversion {

    public static void main(String[] args) {

        // 1. Implicit (automatic / widening) casting
        // Smaller type → larger type: done automatically by compiler
        int num = 5;
        long l = num;           // int → long (automatic)
        double d = num;         // int → double (automatic)
        float f = num;          // int → float (automatic)

        System.out.println("Implicit widening examples:");
        System.out.println("int " + num + " → long: " + l);
        System.out.println("int " + num + " → double: " + d);
        System.out.println("int " + num + " → float: " + f);
        System.out.println();


        // 2. Explicit (manual / narrowing) casting
        // Larger type → smaller type: must use (type) cast → may lose data / precision

        // float → int (loses decimal part - truncation, not rounding)
        float fl = 4.5f;
        int n = (int) fl;               // explicit cast required
        System.out.println("float " + fl + " → int: " + n);   // → 4

        float fl2 = 5.6f;
        int n2 = (int) fl2;
        System.out.println("float " + fl2 + " → int: " + n2); // → 5 (truncates .6)

        // double → int (also truncates)
        double dd = 9.999;
        int ni = (int) dd;
        System.out.println("double " + dd + " → int: " + ni); // → 9

        System.out.println();


        // 3. Narrowing that requires explicit cast (would give compile error without cast)
        // int → byte (possible lossy conversion)
        int big = 130;
        byte small = (byte) big;
        System.out.println("int " + big + " → byte: " + small);   // → -126 (wraps around due to overflow)

        int val = 257;
        byte b = (byte) val;
        System.out.println("int " + val + " → byte: " + b);       // → 1  (257 % 256 = 1)

        // long → int (needs cast)
        long bigLong = 10000000000L;
        int truncated = (int) bigLong;
        System.out.println("long " + bigLong + " → int: " + truncated);  // loses high bits

        System.out.println();


        // 4. Type promotion during arithmetic operations
        // Java promotes smaller types to at least int, or to the larger of the operands

        // byte * byte → promoted to int
        byte a = 120;
        byte b2 = 120;
        // byte result = a * b2;           // ERROR: incompatible types (int → byte)
        int result = a * b2;               // correct: promoted to int
        System.out.println("byte " + a + " * byte " + b2 + " → int: " + result);  // 14400

        // short * short → int
        short s1 = 200;
        short s2 = 300;
        int shortMul = s1 * s2;
        System.out.println("short * short → int: " + shortMul);

        // Mixed types: smaller promoted to larger
        int i = 10;
        float f2 = 3.2f;
        float res = i * f2;                // int promoted to float
        System.out.println("int * float → float: " + res);

        double div = 5.2 / 3;              // int 3 promoted to double → double result
        System.out.println("double 5.2 / int 3 → double: " + div);

        // Even char participates in promotion (char → int via ASCII/Unicode)
        char ch = 'A';                     // 65
        int charAsInt = ch + 5;
        System.out.println("'A' + 5 → int: " + charAsInt);  // 70
    }
}
