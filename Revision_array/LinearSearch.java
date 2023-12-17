package Revision_array;

import java.util.Scanner;

public class LinearSearch {

    public static int  linear(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;

            }
        }
        return -1;
    }

    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Size of the array");
       int size=sc.nextInt();
       int arr[]=new int[size];
       System.out.println("Enter the Number of the array");
       for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println("Enter the Number which you Search");
       int s=sc.nextInt();
       int index=linear(arr, s);
       if(index==-1){
        System.out.println("Not Found");
       }
       else{
        System.out.println("Found in index "+index);
       }
       
    }
    
}
