public class StockBuy {
    
    public static int Stock(int prices[]){

        int BuyPrice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<prices.length;i++){
            if(BuyPrice<prices[i]){   //Profit
                int profit=prices[i]-BuyPrice;
                maxprofit=Math.max(maxprofit,profit);

            }
            else{
                BuyPrice=prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String [] args){
        int arr[]={7,1,5,3,6,4};
        System.out.println(Stock(arr));
    }
}
