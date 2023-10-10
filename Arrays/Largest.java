package Arrays;

public class Largest {

    public static int largest_Number(int n[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            if(largest<n[i]){
                largest=n[i];

            }
        }
        return largest;
    }
    public static void main(String [] args){
        int n[]={1,2,3,6,4,5};
        int x=largest_Number(n);
        System.out.println("The Largest number is "+x);
    }
    
}
