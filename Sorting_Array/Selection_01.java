package Sorting_Array;

public class Selection_01 {
    public static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){

                if(arr[minpos]<arr[j]){
                    minpos=j;
                }
                
            }

            //Swapping 
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
            
        }
    }

    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(" "+arr[i]);
        }
    }

    public static void main(String [] args){
        int arr[]={5,2,1,4,3};
        selection(arr);
        PrintArr(arr);
    }
    
}
