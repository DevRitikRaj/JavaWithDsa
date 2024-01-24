package Recursion;

public class Fabnocii {
    public static int Fab(int n){

        if(n==0 || n==1){
            return n;
        }

        int fnm1=Fab(n-1);
        int fnm2=Fab(n-2);
        int result=fnm1+fnm2;
        return result;


    }

    public static void main(String [] args){
        int n=5;
        System.out.println(Fab(n));
    }
    
}
