package Recursion;

import java.util.Scanner;

public class FabnocciNumber {
    public static int Fab(int n){
        if(n==0 || n==1){
            return n;
        }
        int nm1=Fab(n-1);
        int nm2=Fab(n-2);
        int fn=nm1+nm2;
        return fn;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of the Fabnocci Number");
        int a=sc.nextInt();
        System.out.println(Fab(a));
    }
    
}
