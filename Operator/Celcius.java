package Operator;
import java.util.*;

public class Celcius {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Farenheit");
        int f=sc.nextInt();
        double c=((f-32)* 5/9);
        System.out.println("The Celcuis is "+c);

    }
    
}
