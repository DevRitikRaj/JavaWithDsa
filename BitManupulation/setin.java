package BitManupulation;

public class setin {
    public static int set(int n, int i){
        int bitmask= 1<<i;
          return n | bitmask;
    }
    public static void main(String [] args){
        int n=14;
        int i=0;
        System.out.println(set(n, i));
    }
    
}
