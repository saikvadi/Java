public class JavaDataTypes {
    public static void main(String[] args) {

        // ===== INTEGER DATA TYPES =====

        byte b = 127;
        // byte → 1 byte integer type
        // range: -128 to 127
        // b → variable
        // 127 → value

        short s = 32000;
        // short → 2 byte integer type
        // used for slightly larger numbers than byte

        int num = 50000;
        // int → 4 byte integer (most commonly used integer type)
        // default type for whole numbers

        long bigNumber = 9000000000L;
        // long → 8 byte integer
        // used for very large numbers
        // L suffix required to tell compiler it's long literal


        // ===== DECIMAL (FLOATING POINT) TYPES =====

        float price = 5.6f;
        // float → 4 byte decimal number
        // requires 'f' suffix because decimal literals default to double

        double pi = 3.1415926535;
        // double → 8 byte decimal
        // default type for decimal numbers
        // higher precision than float


        // ===== CHARACTER TYPE =====

        char letter = 'K';
        // char → stores single character only
        // must use single quotes ''
        // supports Unicode characters


        // ===== BOOLEAN TYPE =====

        boolean isJavaEasy = true;
        // boolean → stores only true or false values
        // used for conditions and logic


        // ===== PRINTING VALUES =====

        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + num);
        System.out.println("long value: " + bigNumber);
        System.out.println("float value: " + price);
        System.out.println("double value: " + pi);
        System.out.println("char value: " + letter);
        System.out.println("boolean value: " + isJavaEasy);
    }
}
