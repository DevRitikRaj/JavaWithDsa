package Operator;
import java.util.*;

public class Age {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You can right to vote");
        }
        else{
            System.out.println("You have no right to vote");
        }
    }
    
}
