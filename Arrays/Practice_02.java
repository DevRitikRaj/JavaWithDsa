package Arrays;

import java.util.Scanner;

public class Practice_02 {

    public static int Sell(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of ");
        int n = sc.nextInt();
        System.out.println("Enter the price of the stock");
        int price[] = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        System.out.println("The Maximum Stock " + Sell(price));
    }

}
