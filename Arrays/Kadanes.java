package Arrays;

public class Kadanes {


    public static void kadans(int n[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<n.length;i++){
            cs=cs+n[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("The Maximum value is "+ms);
    }

    public static void main(String []args){
        int n[]={-2,-4,3,2,4};
        kadans(n);
    }
    
}
