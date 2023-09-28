package Loop;

public class Reverse_original_number {
    public static void main(String [] ar){
    int n=123;
    int rev=0;
    while(n>0){
        int ld=n%10;
        rev=(rev*10)+ld;
        n/=10;
    }
     
    System.out.println(rev);
       


    }
}
