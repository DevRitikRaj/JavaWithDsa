package Revision_array;

import java.util.Scanner;

public class t5 {
public static int binary(int arr[],int key){
    int start=0,end=arr.length-1;
    while (start<=end) {
        int mid=(start+end)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]>key){
            end=mid-1;
        }
        else{
            mid=mid+1;
        }
        
    }
    return -1;
}

public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the of the array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the Element");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the Element of the Array which search");
    int search=sc.nextInt();
    int result=binary(arr, search);
    System.out.println("Element Found in "+result);


}
    
}
