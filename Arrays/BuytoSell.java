package Arrays;

import java.util.Scanner;

public class BuytoSell {

    public static int buytosell(int prices[]){

        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice; // Today Price
                maxProfit=Math.max(maxProfit, profit);
            }else{
                buyPrice=prices[i];
            }
        }

        return maxProfit;
    }


    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Number of Stock");
        int n=sc.nextInt();
        System.out.println("Enter the Stock Prices");
        int price[] = new int [n];
        for(int i=0;i<price.length;i++){
            price[i]=sc.nextInt();
        }
        System.out.println("The Maximum profit is = "+buytosell(price));


    }
    
}
