
package Sorting_Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Inbuild_fun {
    public static void Prinarr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
      
    }

    public static void main(String [] args){
        Integer arr[]={1,4,2,5,3};
        // Arrays.sort(arr,0,4);
        Arrays.sort(arr,Collections.reverseOrder());
        // Arrays.sort(arr,0,3,Collections.reverseOrder());
        Prinarr(arr);
    }
   

    
}
