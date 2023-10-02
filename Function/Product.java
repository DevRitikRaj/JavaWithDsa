package Function;
import java.util.*;
public class Product {
    public static int product(int a,int b){
        int mul=a*b;
        return mul;

    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int x=sc.nextInt();
        System.out.println("Enter the second Number");
        int y=sc.nextInt();
        int mul=product(x, y);
        System.out.println(mul);
    }
    
}
