package Operator;
import java.util.*;
public class Factorail_Assignment_op {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int fac=1;
        for(int i=1;i<=a;i++){
           
            fac*=i;
        }
        System.out.println("The Factorial of "+a+" is "+fac);

    
    }
    
}
