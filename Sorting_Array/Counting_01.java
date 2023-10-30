package Sorting_Array;

public class Counting_01 {

    public static void Count(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);

        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        // Sorting
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }
    public static void Prinarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(" "+arr[i]);
        }
    }

    public static void main(String [] args){
        int arr[]={5,3,1,4,2};
        Count(arr);
        Prinarr(arr);
    }


}
