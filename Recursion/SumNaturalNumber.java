package Recursion;

import java.util.Scanner;

public class SumNaturalNumber {

    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int Snm1=Sum(n-1);
       int  result =n+Snm1;
       return result;
    }



    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        System.out.println(Sum(n));

    }
    
}
