package Inheritance;

public class hello {

    public static int Square(int x,  int n){
        if(n==0){
            return 1;
        }
        return x* Square(x, n-1);
    }
    public static void main(String []args){
        System.out.println(Square(2, 3));

    }
    
}
