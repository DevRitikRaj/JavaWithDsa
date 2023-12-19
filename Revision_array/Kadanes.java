package Revision_array;

public class Kadanes {

    public static void Kad(int n[]){
        int max=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<n.length;i++){
            cs=cs+n[i];
            if(cs<0){
                cs=0;
            }
            max=Math.max(cs,max);
        }
        System.out.println("The Maximum sum is "+max);
    }

    public static void main(String [] args){
        int n[]={-2,-3,4,-1,-2,1,5,-3};
        Kad(n);
    }
    
}
