package BitManupulation;

public class clearith {

    public static int clear(int n, int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }
    public static void main(String [] args){
        int n=14;
        int i=2;
        System.out.println(clear(n, i));
    }




    
}
