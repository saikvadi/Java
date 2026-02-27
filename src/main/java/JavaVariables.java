public class JavaVariables {
    public static void main(String[] args) {

        // datatype variableName = value;

        int num1 = 3;   
        // int → data type
        // num1 → variable name
        // 3 → value stored inside variable

        int num2 = 5;   
        // another variable storing integer value

        int result = num1 + num2;  
        // result → variable name
        // num1 + num2 → expression whose value is stored in result

        System.out.println("Result: " + result);
        // System → class
        // out → output stream object
        // println → method that prints and moves to next line

        double price = 99.99;      
        // double → data type for decimal numbers
        // price → variable
        // 99.99 → value

        char grade = 'A';          
        // char → data type for single character
        // grade → variable
        // 'A' → value

        boolean isJavaFun = true;  
        // boolean → data type for true/false
        // isJavaFun → variable
        // true → value

        String name = "Sai";       
        // String → class used as data type for text
        // name → variable
        // "Sai" → value

        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun: " + isJavaFun);
        System.out.println("Name: " + name);
    }
}
