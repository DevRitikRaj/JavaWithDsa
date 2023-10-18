package Arrays;

public class KadanesPractice {

    public static void kadan(int n[]){
        int mx=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<n.length;i++){
            cs=cs+n[i];
            if(cs<0){
                cs=0;
            }
            mx=Math.max(cs, mx);
        }
        System.out.println(mx);

    }

    public static void main(String [] args){
        int a[]={-2,-4,3,2,4};
        kadan(a);
    }
    
}
