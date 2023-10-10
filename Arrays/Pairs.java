package Arrays;

public class Pairs {

    public static void  pairs(int n[]){
        // int tp=0;
        
        for(int i=0;i<n.length;i++){
            
            int start=n[i];
            for(int j=i+1;j<n.length;j++){
                System.out.print("(" +start +"," +n[j] +")");
                // tp++;
               
            }
            
            System.out.println();
            

        }
        // System.out.println("Total Number of the Pair is "+tp);

        
    }
    
    public static void main(String [] args){
        int n[]={1,2,3,4,5};
        pairs(n);
    }
}
