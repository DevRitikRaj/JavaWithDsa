package Leetcode;

public class TwoSum {
    public static int[] sum(int num[],int target){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};

    }

    public static void main(String [] args){
        int arr[]={1,2,3,4,5};
        int target=9;
        int res[]=sum(arr, target);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
        
    }
}
