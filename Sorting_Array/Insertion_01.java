package Sorting_Array;

public class Insertion_01 {
    public static void insert(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;

            while (prev>=0 && arr[prev]<curr) {
                arr[prev+1]=arr[prev];
                prev--;
                
            }
            //Insertion
            arr[prev+1]=curr;
        }
    }

    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(" "+arr[i]);
        }
    }

    public static void main(String [] ar){
        int a[]={5,1,3,4,2};
        insert(a);
        PrintArr(a);
    }
    
}
