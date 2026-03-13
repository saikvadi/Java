

public class LargestNumberInArray.java {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int[] numbers = {-20, 12, 45, 7, 89, 23, 56, 654, 91, 34, 120};
        int LargestNumber = numbers[0];
        
        System.out.println(LargestNumber);
        
        for(int num : numbers){
         
           if(num>LargestNumber){
               LargestNumber = num;
           }
           
           
        }
        System.out.println(LargestNumber);
    }
}
