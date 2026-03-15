// ========================================================
// Concept : if-else-if Ladder
// Purpose : Select one condition from multiple conditions
// ========================================================

// Syntax
// if(condition1){
//     statement
// }
// else if(condition2){
//     statement
// }
// else{
//     statement
// }

public class IfElseIfExample {

    public static void main(String[] args) {

        int x = 8;
        int y = 7;
        int z = 6;

        if (x > y && x > z) {
            System.out.println("x is the greatest number: " + x);
        }
        else if (y > z) {
            System.out.println("y is the greatest number: " + y);
        }
        else {
            System.out.println("z is the greatest number: " + z);
        }

    }
}
