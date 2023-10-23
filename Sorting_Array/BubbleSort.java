package Sorting_Array;


public class BubbleSort {
   


    public static void bubble(int arr[]){
         int swap=0;
         int count=0;


        for(int turn=0;turn<arr.length;turn++){
            count++;
            System.out.println(count);
            
            for(int j=0;j<arr.length-1-turn;j++){
                count++;
                System.out.println(count);
                

                if(arr[j]>arr[j+1]){
                   
                    

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   swap++;
                   

                    
                }
               
            }
        }
        System.out.println("The Number of swap is "+swap);
        System.out.println("The Number of Interation  is "+count);
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
