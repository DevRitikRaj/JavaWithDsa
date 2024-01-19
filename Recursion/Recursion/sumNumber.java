package Recursion;

public class sumNumber {

    public static int Sum(int n){

        if(n==1){
            return n;
        }


        int snm= n+ Sum(n-1);
        return snm;


    }
    public static void main(String [] args){
        int n=5;
        System.out.println(Sum(n));
    }
    
}
