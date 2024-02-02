package Leetcode;

public class leetCode_121 {

    public static int MaxValue(int price[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){
                int profit=price[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
            }
            else{
                buyprice=price[i];
            }
        }
        return maxprofit;
    }

    public static void main(String [] args){
        int arr[]={7,6,4,3,};
        System.out.println(MaxValue(arr));
    }

    
}
