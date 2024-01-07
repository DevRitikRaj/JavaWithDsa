package BitManupulation;

public class ispower {

    public static boolean ispow(int n){
        return (n & (n-1))==0;
    }

    public static void main(String [] args){
        System.out.println(ispow(9));
    }
    
}
