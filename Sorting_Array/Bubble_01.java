package Sorting_Array;

public class Bubble_01 {

    public static void bubble(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(" "+arr[i]);
        }
    }
    public static void main(String []args){
        int arr[]={5,3,1,4,2};
        bubble(arr);
        PrintArr(arr);
    }
    
}
