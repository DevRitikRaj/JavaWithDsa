package Conditional;
import java.util.*;
public class Ternary {
    public static void main(String [] r){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        int m=sc.nextInt();
        String marks=(m>=33) ? "Pass" : "Fail";
        System.out.println("You are "+marks);
    }
    
}
