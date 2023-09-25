package Conditional;
import java.util.*;
public class Odd_Even {
    public static void main(String [] ritik){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("The "+num + " is Even");
        }
        else{
            System.out.println("The "+num+ " is Odd");
        }
    }
    
}
