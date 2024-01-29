package Leetcode;

public class Question_27 {


    public static int Sorted(int num[], int val){
        int j=0;
        for(int i=0;i<num.length;i++){
            if(num[i]!=val){
                
                num[j++]=num[i];
                
            }
        }
        return j;
        
   }

   public static void main(String [] args){
    int arr[]={3,2,2,3};
    System.out.println(Sorted(arr, 3));

   }
    
}




    

