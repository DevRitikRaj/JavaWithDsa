package Recursion;

public class psedo1 {

    public static void  funn(int n){
        if(n>0){
            funn(--n);
            System.out.println(n);
            funn(--n);
        }


    }
    public static void main(String [] args){
        funn(4);
        System.out.println();

    }
    
    
}
