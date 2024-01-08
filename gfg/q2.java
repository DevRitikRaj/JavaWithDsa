package gfg;

import java.util.Arrays;

public class q2 {

    public static void reverse(int arr[]){
        int n= arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
      
      
    }
    public static void main(String [] args){
        int arr[]={1,2,4,3,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
