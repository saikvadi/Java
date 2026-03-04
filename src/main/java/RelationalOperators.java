public class RelationalOperators {
    public static void main(String[] args) {

        // 1. Basic setup - two integer variables
        int x = 10;
        int y = 7;

        System.out.println("Relational Operators Demo");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("--------------------------------");

        // 2. All six relational operators with integers
        System.out.println("x <  y  → " + (x < y));     // false
        System.out.println("x >  y  → " + (x > y));     // true
        System.out.println("x <= y  → " + (x <= y));    // false
        System.out.println("x >= y  → " + (x >= y));    // true
        System.out.println("x == y  → " + (x == y));    // false  (comparison, NOT assignment!)
        System.out.println("x != y  → " + (x != y));    // true

        System.out.println("--------------------------------");

        // 3. Storing results in boolean variables (very common pattern)
        boolean isLess      = (x < y);
        boolean isGreater   = (x > y);
        boolean isEqual     = (x == y);
        boolean isNotEqual  = (x != y);
        boolean isLessOrEq  = (x <= y);
        boolean isGreaterOrEq = (x >= y);

        System.out.println("Stored in booleans:");
        System.out.println("isLess       : " + isLess);
        System.out.println("isGreater    : " + isGreater);
        System.out.println("isEqual      : " + isEqual);
        System.out.println("isNotEqual   : " + isNotEqual);
        System.out.println("isLessOrEq   : " + isLessOrEq);
        System.out.println("isGreaterOrEq: " + isGreaterOrEq);

        System.out.println("--------------------------------");

        // 4. Important note: = is assignment, == is comparison
        System.out.println("Common mistake example:");
        // int z = x == y;   // This is correct → assigns boolean result to z
        // int z = x = y;    // This is assignment → z becomes 7, x becomes 7 (dangerous in conditions!)

        // 5. Works with double / floating-point too
        double a = 5.8;
        double b = 5.8;

        System.out.println("With doubles → a = " + a + ", b = " + b);
        System.out.println("a == b → " + (a == b));   // true
        System.out.println("a != b → " + (a != b));   // false
        System.out.println("a <= b → " + (a <= b));   // true

        System.out.println("--------------------------------");

        // 6. Real-world-like usage hint (used in if, while, for later)
        System.out.println("Relational operators are mostly used in:");
        System.out.println("- if conditions");
        System.out.println("- while / do-while loops");
        System.out.println("- for loop conditions");
        System.out.println("Example idea: if (marks >= 40) → pass");
    }
}
