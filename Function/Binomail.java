package Function;
import java.util.*;
public class Binomail {
    public static int facorial(int num){
        int f=1;
        for(int i=1;i<=num;i++){
            f=f*i;
        }
        return f;
    }

    public static int binoCoff(int n,int r){
        int n_fact=facorial(n);
        int r_fact=facorial(r);
        int nmr_fact=facorial(n-r);
        int BC=(n_fact) / (r_fact*nmr_fact);
        System.out.println("The binomail coffient of "+n+ " and "+r+" is "+BC);
         return BC;
        
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int a=sc.nextInt();
        System.out.println("Enter the value of r");
        int b= sc.nextInt();
        binoCoff(a, b);
        

    }
   
    
}
