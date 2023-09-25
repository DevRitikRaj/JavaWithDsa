package Conditional;
import java.util.*;

public class LargestTwo {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second Number");
        int b=sc.nextInt();

        if(a>=b){
            System.out.println(+a+ "  is greater ");
        }
        else{
            System.out.println(+b +" is greater");
        }
    }
    
}
