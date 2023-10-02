package Function;
import java.util.*;
public class Add {

    public static int sum_add(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number");
        int b=sc.nextInt();
        int sum1=sum_add(a, b);
        System.out.println("The Sum of the two number "+ sum1);
    }
    
}
