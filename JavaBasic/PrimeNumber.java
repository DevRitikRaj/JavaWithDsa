import java.util.*;
public class PrimeNumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the given Number");
        int n=sc.nextInt();
        int div=2;
        int count=0;
        while(div<n){
            if(n%div==0){
                count++;
                break;                
            }
            div=div+1;
        }
        if(count==0){
            System.out.println("It is Prime Number");
        }
        else{
            System.out.println("It is Not Prime Number");
        }

    }
    
}
