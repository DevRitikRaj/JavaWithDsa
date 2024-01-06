package BitManupulation;

public class GetIn {
    public static int get(int n, int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String [] args){
        int n=14;
        int i=3;
        System.out.println(get(n, i));
        
    }
    
}
