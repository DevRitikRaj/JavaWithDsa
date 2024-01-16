package Recursion;

import java.util.Scanner;

public class CheckSorted {

    public static boolean Check(int n[], int i){
        if(i==n.length-1){
            return true;
        }

        if(n[i]> n[i+1]){
            return false;
        }
        return Check(n, i+1);


    }





    public static void main(String [] args){
       int arr[]={1,2,4,3,5};
       System.out.println(Check(arr, 0));

    }
    
}
