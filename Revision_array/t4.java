package Revision_array;

import java.util.Scanner;

public class t4 {
    public static int small(int arr[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(smallest > arr[i]){
                smallest=arr[i];
            }
        }
        return smallest;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int index=small(arr);
        System.out.println("Smallest Number is "+index);
    }
    
}
