/*

 * Telusko Style – Full Summary from Video #12: If else in Java
 * 
 * "Hello friends! Namaste!
 *  Arithmetic chesam, relational chesam, logical operators (&& || !) chesam...
 *  Ippudu real programs lo decisions teesukovali – like 'if this happens, do this, else do that'.
 *  Conditional statements ante idi! Real life lo Tesla car obstacle chuste stop avuthundi – same way program flow change avuthundi.
 *  Today focus on if-else. Next videos lo if-else-if ladder, switch, ternary operator vastayi."
 * 
 * Condition MUST be boolean (true/false) – number direct ga vaddu (if(5) error istundi!).
 * Curly braces {} important when multiple statements.
 */

public class IfElse {
    
    public static void main(String[] args) {
        
        System.out.println("=== Telusko Style - If else Full Demo ===\n");
        
        // Example 1: Even or Odd (super common interview question)
        int num = 13;   // try changing to 10 or 7
        
        System.out.println("Number: " + num);
        
        if (num % 2 == 0) {   // condition → boolean (true/false)
            System.out.println("Even");
            System.out.println("Also divisible by 2!");  // multiple lines → {} must
        } else {
            System.out.println("Odd");
        }
        
        System.out.println("---");
        
        
        // Example 2: Simple if-else with single statement ({} optional)
        int x = 18;
        
        if (x > 10) 
            System.out.println("Hello");   // single line → no {} needed
        else 
            System.out.println("Bye");
        
        // But careful: multiple lines without {} → bug avuthundi!
        // Wrong way demo (commented – don't uncomment!)
        // if (x > 10)
        //     System.out.println("Hello");
        //     System.out.println("Extra line");   // This runs always! (dangling else issue)
        
        System.out.println("---");
        
        
        // Example 3: Using logical operators inside if (previous video link!)
        int age = 22;
        boolean hasLicense = true;
        
        if (age >= 18 && hasLicense) {
            System.out.println("You can drive! Safe journey bro.");
        } else {
            System.out.println("Sorry, cannot drive yet.");
        }
        
        System.out.println("---");
        
        
        // Example 4: Find maximum of two numbers (with multiple statements in if)
        int a = 5;
        int b = 7;
        
        System.out.println("Numbers: a=" + a + ", b=" + b);
        
        if (a > b) {
            System.out.println("Max is: " + a);
            System.out.println("Thank you for using max finder!");
        } else {
            System.out.println("Max is: " + b);
            System.out.println("b wins!");
        }
        
        System.out.println("---");
        
        
        // Important Rule Demo: Condition MUST be boolean!
        System.out.println("Wrong way (will NOT compile):");
        // if(5) {   // Error: Type mismatch: cannot convert from int to boolean
        //     System.out.println("This won't run");
        // }
        System.out.println("(Commented – compiler error if uncommented!)");
        
        System.out.println("\nFriends... if-else ante program ki brain ichina lanti vishayam.");
        System.out.println("Condition true → if block run, false → else block run.");
        System.out.println("else lekunda if vadachu, but else undali ante if undali.");
        System.out.println("Curly braces use cheyandi multiple lines unte – indentation just for reading.");
        System.out.println("Practice cheyandi: even/odd, max of 3 numbers try cheyandi.");
        System.out.println("Next video lo if-else-if ladder & switch vastundi!");
        System.out.println("Like, share, subscribe... doubts unte comment lo adagandi! 🚀");
    }
}
