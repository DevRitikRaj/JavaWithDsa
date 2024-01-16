package Recursion;

public class Power {

    public static int Pow(int x,int n){
        if(n==0){
            return 1;
        }

        // int nm1=Pow(x, n-1);
        // int xn=x * nm1;
        // return xn;
        return x * Pow(x, n-1);
    }
    

    public static void main(String [] args){
        System.out.println(Pow(5, 2));

    }
    
}
