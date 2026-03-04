public class ArithmeticOperators {
    public static void main(String[] args) {

        // 1. Basic arithmetic operators: +, -, *, /, %
        int a = 11;
        int b = 4;

        System.out.println("Basic Arithmetic Operators:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));     // Addition → 15
        System.out.println("a - b = " + (a - b));     // Subtraction → 7
        System.out.println("a * b = " + (a * b));     // Multiplication → 44
        System.out.println("a / b = " + (a / b));     // Integer division → 2 (quotient)
        System.out.println("a % b = " + (a % b));     // Modulus (remainder) → 3

        System.out.println("-----------------------------");

        // 2. Compound / shorthand assignment operators
        int num = 10;

        System.out.println("Compound Assignment Operators (start with num = " + num + "):");
        num += 5;     // num = num + 5
        System.out.println("num += 5  → " + num);   // 15

        num -= 3;     // num = num - 3
        System.out.println("num -= 3  → " + num);   // 12

        num *= 2;     // num = num * 2
        System.out.println("num *= 2  → " + num);   // 24

        num /= 4;     // num = num / 4
        System.out.println("num /= 4  → " + num);   // 6

        num %= 5;     // num = num % 5
        System.out.println("num %= 5  → " + num);   // 1

        System.out.println("-----------------------------");

        // 3. Increment (++) and Decrement (--) operators - POST vs PRE

        int x = 5;

        System.out.println("Increment / Decrement - POST vs PRE:");
        System.out.println("Original x = " + x);

        // Post-increment: use value first, then increment
        System.out.println("x++  (post) → prints: " + (x++) + " , now x = " + x);
        // prints 5, then x becomes 6

        // Pre-increment: increment first, then use value
        System.out.println("++x  (pre)  → prints: " + (++x) + " , now x = " + x);
        // increments to 7, then prints 7

        // Post-decrement
        System.out.println("x--  (post) → prints: " + (x--) + " , now x = " + x);
        // prints 7, then x becomes 6

        // Pre-decrement
        System.out.println("--x  (pre)  → prints: " + (--x) + " , now x = " + x);
        // decrements to 5, then prints 5

        System.out.println("-----------------------------");

        // Quick real-world-like example combining operators
        int score = 100;
        score += 20;           // bonus
        score -= 15;           // penalty
        score++;               // extra point (post)
        System.out.println("Final score calculation: " + score);
    }
}
