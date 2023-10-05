package Adv_pattern;
import java.util.*;
public class Butterfly {

    public static void BF(int n){
       
        for(int i=1;i<=n;i++){
             // 1st Half


            //   print Star

             for(int j=1;j<=i;j++){
                System.out.print("*");
             }

             // print space

             for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
             }

             // print Star

             for(int j=1;j<=i;j++){
                System.out.print("*");
             }
             System.out.println();


        }

        // 2nd half

        for(int i=n;i>=1;i--){

             for(int j=1;j<=i;j++){
                System.out.print("*");
             }

             // print space

             for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
             }

             // print Star

             for(int j=1;j<=i;j++){
                System.out.print("*");
             }

             System.out.println();


            
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        BF(n);
    }

    
}
