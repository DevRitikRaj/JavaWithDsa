package Conditional;
import java.util.*;
public class practice_02 {
    public static void main(String [] ars){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature");
        double temp=sc.nextDouble();
        if(temp>100){
            System.out.println("You have  fever");
        }
        else{
            System.out.println("You haven't fever");
        }

    }
    
}
