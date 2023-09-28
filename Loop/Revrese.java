package Loop;
import java.util.*;
public class Revrese {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        while(n>0){
            int ld=n%10;
            System.out.print(ld);
            n/=10;
        }
        System.out.println();
       
    }
    
}
