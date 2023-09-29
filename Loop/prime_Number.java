package Loop;

import java.util.Scanner;

public class prime_Number {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n==2){
            System.out.println(+n +" is prime number");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%2==0){
                    isPrime=false;
                }

            }

            if(isPrime==true){
                System.out.println(+n +" is prime number");
            }
            else{
                System.out.println(+n+" is not prime number");

            }







        }

    }
    
}
