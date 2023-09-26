package Conditional;
import java.util.*;

public class Practice1 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the interger");
        int a=sc.nextInt();
        // if -else
        if(a>0){
            System.out.println(a+ "is positive number");
        }

        else if(a<0){
            System.out.println(a+ " is negative number");
        }

        else{
            System.out.println(a+ "is natural number");
        }
    }
    
}
