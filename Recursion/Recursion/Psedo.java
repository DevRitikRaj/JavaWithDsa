package Recursion;

public class Psedo {

    public static void fun(int n){
        if(n>0){
            fun(n-1);
            System.out.print(n);
            fun(n-1);
            
        }
    }
    public static void main(String [] args){
        fun(4);
        System.out.println();

        


    }
    
}
