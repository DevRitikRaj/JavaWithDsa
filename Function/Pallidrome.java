package Function;
import java.util.*;
public class Pallidrome {


    public static int Palli(int n){
        int pal_num = 0;
        while(n!=0){
            int rem = n%10;
            pal_num = pal_num*10+rem;
            n=n/10;    
        }
      
       return pal_num;
        
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int res= Palli(n);
        if(n == res){
            System.out.println("yes");
        }
        else{
            System.out.println("N0");
        }
        
    }


    
}
