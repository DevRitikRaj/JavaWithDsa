package Function;
import java.util.*;
public class Average {


    public static void Avg(int a, int b, int c){
        int avg=(a+b+c)/3;
        System.out.println("The Average of the three number is "+avg);
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three Number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Avg(a, b, c);
    }
    
}
