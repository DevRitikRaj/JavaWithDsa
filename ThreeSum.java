import java.util.*;


public class ThreeSum {

    public static void Sum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        System.out.println(" "+i+" "+j+" "+k);

                    }
                }

            }
        }
    }





    public static void main(String [] args){
        int arr[]={1,2,3,4,5};
        int target=6;
        Sum(arr, target);

    }
    
}
