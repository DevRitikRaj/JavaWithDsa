package Arrays;

public class Smallest {

    public static int smallest_largest(int n[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<n.length;i++){
            if(smallest>n[i]){
                smallest=n[i];

            }
            
        }
        return smallest;

    }
    public static void main(String [] args){
        int num[]={3,51,6,3,5,};
        int ans=smallest_largest(num);
        System.out.println("The largest number is "+ans);
    }
    
}
