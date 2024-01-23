package Recursion;

public class Sorted_Array {
    public static int Sorted(int arr[], int target,int si,int ei){
        if(si>ei){
            return -1;
        }

        int mid=si+(ei-si)/2;

       if(arr[mid]==target){
        return mid;
       }

       //Line 1-----------

       if(arr[si]<= arr[mid]){

        // case:a
        if(arr[si]<=target && target<=arr[mid]){
            return Sorted(arr, target, si, mid-1);
        }
        else{
            // case : b
            return Sorted(arr, target, mid+1, ei);
        }
       }


        // Line 2
       else{
        if(arr[mid]<=target && target <=arr[mid]){
            return Sorted(arr, target, mid+1, ei);

        }
        else{
            return Sorted(arr, target, si, mid-1);
        }

       }

    }

    public static void main(String [] args){
        int arr[]={4,5,6,7,0,1,2,3};
        int target=8;
        int TarIdx=Sorted(arr, target, 0,arr.length-1);
        System.out.println(TarIdx);
    }
    
}
