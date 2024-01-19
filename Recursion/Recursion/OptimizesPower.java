package Recursion;

public class OptimizesPower {

    public static int Power(int x,int n){
        if(n==0){
            return 1;
        }
        int halfwork=Power(x, n/2);
        int halfsquare=halfwork*halfwork;

        if(n%2 !=0){
            halfsquare = x*halfsquare;
        }



        return halfsquare;
    }

    public static void main(String [] args){
        System.out.println(Power(2, 3));

    }
    
}
