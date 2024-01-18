package Recursion;

public class AmazonTillingProblem {
    public static int tiles(int n){

        if(n==0 || n==1){
            return 1;
        }

        int fnm1=tiles(n-1);
        int fnm2=tiles(n-2);
        int totalways=fnm1+fnm2;
        return totalways;

    }
    public static void main(String [] args){
        int n=4;
        System.out.println(tiles(n));
    }
    
}
