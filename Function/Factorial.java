package Function;
import java.util.*;
public class Factorial {
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact= fact*i;
            


        }
        return fact;
       
      
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the facorial");
        int a=sc.nextInt();
        int facto=factorial(a);
        System.out.println(facto);
    }


    
}
