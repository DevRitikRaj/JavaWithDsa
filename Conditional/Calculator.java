package Conditional;
import java.util.*;

public class Calculator {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number");
        int b=sc.nextInt();
        System.out.println("Choose your Operation");
        char op=sc.next().charAt(0);
        switch(op){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '/': System.out.println(a/b);
            break;
            case '%': System.out.println(a%b);
            break;
            default : System.out.println("You choose right operation");
        }
    }
    
}
