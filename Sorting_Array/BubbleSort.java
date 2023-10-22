package Sorting_Array;


public class BubbleSort {
   


    public static void bubble(int arr[]){
         int swap=0;
        for(int turn=0;turn<arr.length;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                

                if(arr[j]>arr[j+1]){
                   
                    

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   swap++;
                   

                    
                }
               
            }
        }
        System.out.println("The Number of swap is "+swap);
    }

    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String [] args){
        int arr[]={5,4,1,3,2};
        bubble(arr);
        PrintArr(arr);
    }
    
}
