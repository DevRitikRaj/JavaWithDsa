package BitManupulation;

public class Update {

    public static int  clear(int n,int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }

    public static int Upd(int n,int i, int newBit){
        n=clear(n, i);
        int bitmask=newBit<<i;
        return n | bitmask;


    }
    public static void main(String [] args){
        int n=14;
        int i=2;
        int newBit=0;
        System.out.println(Upd(n, i, newBit));
    }
    
}
