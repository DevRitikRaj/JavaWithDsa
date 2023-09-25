package Conditional;
import java.util.*;
public class Largest_Three {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Number");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd Number");
        int b=sc.nextInt();
        System.out.println("Enter the 3rd Number");
        int c=sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("The greatest number is "+a);
        }

        else if(b>=c){
            System.out.println("The greatest Number is "+b);
        }

        else{
            System.out.println("The greatest number is "+c);
        }

    }
    
}
