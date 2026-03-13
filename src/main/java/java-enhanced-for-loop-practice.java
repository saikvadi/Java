// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class java-enhanced-for-loop-practice {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int sum = 0;
        
        for(int num:numbers){
            sum += num;
        }
        System.out.println(sum);
    }
}
