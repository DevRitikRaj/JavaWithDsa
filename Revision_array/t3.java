package Revision_array;

import java.util.Scanner;

public class t3 {
    public static int largest(int arr[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];

            }

        }
        return large;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the Array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int result=largest(arr);
        System.out.println("The largest Element is "+result);
    }
    
}
