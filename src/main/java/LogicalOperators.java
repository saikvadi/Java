/*
 * 
 * Telusko Style Explanation – Full Summary from Video #11
 * 
 * "Hello friends! Namaste! 
 *  Arithmetic operators chesam, relational operators (>, <, ==, !=) chesam...
 *  Ippudu real programs lo okka condition kaadu... multiple conditions check cheyali.
 *  Like: age > 18 AND marks > 60... so ee TRUE/FALSE values ni combine cheyadaniki 
 *  Logical Operators use chestam: && (AND), || (OR), ! (NOT)"
 * 
 * Video lo live ga code run chesi chupinchadu – same vibe lo ee file lo undi.
 * Short-circuit magic kuda explain chesa.
 */

public class LogicalOperators {
    
    public static void main(String[] args) {
        
        System.out.println("=== Telusko Style - Logical Operators Full Demo ===\n");
        
        // Variables just like in video (small changes for clarity)
        int x = 7;
        int y = 5;
        int a = 10;
        int b = 9;
        
        System.out.println("Values: x=" + x + ", y=" + y + ", a=" + a + ", b=" + b + "\n");
        
        
        // 1. AND Operator  -->  &&
        // Rule: Both true → true    Any one false → false
        // Short-circuit: First false ayithe second condition check cheyadu (time save!)
        
        System.out.println("=== AND (&&) Examples ===");
        
        boolean and1 = (x > y) && (a > b);          // true && true → true
        System.out.println("(x > y) && (a > b)  → " + and1);   // true
        
        boolean and2 = (x > y) && (a < b);          // true && false → false
        System.out.println("(x > y) && (a < b)  → " + and2);   // false
        
        // Short-circuit demo
        System.out.println("\nShort-circuit magic in &&:");
        boolean shortAnd = (x < y) && (10 / 0 == 0);   // First is false → second NOT evaluated → No error!
        System.out.println("(x < y) && (divide by zero) → " + shortAnd + "  (no crash!)");
        
        
        // 2. OR Operator  -->  ||
        // Rule: At least one true → true    Both false → false
        // Short-circuit: First true ayithe second check cheyadu
        
        System.out.println("\n=== OR (||) Examples ===");
        
        boolean or1 = (x > y) || (a > b);           // true || true → true
        System.out.println("(x > y) || (a > b)  → " + or1);
        
        boolean or2 = (x < y) || (a > b);           // false || true → true
        System.out.println("(x < y) || (a > b)  → " + or2);
        
        boolean or3 = (x < y) || (a < b);           // false || false → false
        System.out.println("(x < y) || (a < b)  → " + or3);
        
        // Short-circuit demo
        System.out.println("\nShort-circuit magic in ||:");
        boolean shortOr = (x > y) || (10 / 0 == 0);   // First is true → second NOT evaluated → No error!
        System.out.println("(x > y) || (divide by zero) → " + shortOr + "  (no crash!)");
        
        
        // 3. NOT Operator  -->  !
        // Just reverses: true → false, false → true
        
        System.out.println("\n=== NOT (!) Examples ===");
        
        boolean isRaining = false;
        System.out.println("isRaining = " + isRaining);
        System.out.println("!isRaining  → " + !isRaining);   // true → vellipodam!
        
        boolean eligible = (a > b);                     // true
        System.out.println("\neligible = " + eligible);
        System.out.println("Not eligible = " + !eligible);   // false
        
        
        // Combining many conditions (video lo cheppinattu – as many as you want)
        System.out.println("\n=== Multiple Conditions Combined ===");
        
        boolean complex = (x > y) && (a > b) || (a > 100) && !(isRaining);
        // true     && true     || false     && true
        //        true          || false
        //                   true
        System.out.println("(x>y && a>b) || (a>100 && !isRaining) → " + complex);
        
        
        System.out.println("\nFriends... ee logical operators if-else, while, for loops lo super use avuthayi.");
        System.out.println("Always use && and || (short-circuit) – single & | vaddu (slow avuthundi).");
        System.out.println("Got it? Practice cheyandi... next video lo if-else start chestam!");
        System.out.println("Like, share, subscribe... doubts unte comment lo adagandi! 😄");
    }
}
