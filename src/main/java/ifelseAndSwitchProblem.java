// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
publi class ifelseAndSwitchProblem {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter a Number :  ");
        
        
        
        String a = s.nextLine();
        char c = a.charAt(0);
        System.out.println(c);
        
        if(c>='a'&& c<='z' || c>='A'&& c<='Z'  ){
  
            switch(c){
                case 'a': case 'e': case 'i': case 'o': case 'u':
                case 'A': case 'E': case 'I': case 'O': case 'U':
                     System.out.println("This is a vowel");
                     break;
                default :
                     System.out.println("This is a consonant");
            }
        }else{
            System.out.println("This is not an alphabet");
        }
    }
}
