package Function;
import java.util.*;
public class BC {

    public static int bincof(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
            
            
        }
        return f;
        
    }

    public static int binocoff(int n,int r){
        int n_fact=bincof(n);
        int r_fact=bincof(r);
        int nmr_fact=bincof(n-r);
        int cal=(n_fact)/(r_fact * nmr_fact);
        
         return cal;

    }
           

    

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  n number");
        int n=sc.nextInt();
        System.out.println("Enter the  r number");
        int r=sc.nextInt();
       System.out.println(binocoff(n, r)); 
    }
    
}
