package Recursion;

public class Factorial {

    public static int Fact(int n){
        
    if(n==0){
        return 1;
    }

    int fnm1=Fact(n-1);
    int result= n* fnm1;
    return result;
}

public static void main(String [] args){
    int n=5;
   System.out.println(Fact(n));
}

    
}
