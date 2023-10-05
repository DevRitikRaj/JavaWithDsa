package Function;
import java.util.*;
public class SumOfInteger {

    public static void Sum(int n){
       int sum=0;
       while(n>0){
        int ld=n%10;
        sum=sum+ld;
        n=n/10;
       }
       System.out.println("The Sum of the Integer is = "+sum);
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer");
        int n=sc.nextInt();
        Sum(n);

    }
    
}
