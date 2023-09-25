package Conditional;
import java.util.*;

public class IncomeTax {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Income");
    int incm=sc.nextInt();

    if(incm<500000){
        System.out.println("You have not pay any type of the tax");
    }

    else if(incm <= 500000 && incm <1000000){
        double tax= (int) incm * 0.2;
        System.out.println("The total amount with tax is "+tax);
    }
    else{
        double tax= (int) incm * 0.3;
        System.out.println("The total amount with tax is "+tax);

    }
    
}

}
