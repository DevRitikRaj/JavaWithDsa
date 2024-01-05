package gfg;

import java.util.*;

public class sorting {
    public static void sor(int arr[]){
        Arrays.sort(arr);
         for(int i=0;i<arr.length;i++){
            System.out.print(" "+ arr[i]);
         }
         System.out.println();
    }

    public static void main(String args[]){
        int arr[]={2,4,1,22,10};
        sor(arr);

        
    }
    
}
