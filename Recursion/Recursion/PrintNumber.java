package Recursion;






public interface PrintNumber {
    public static void Number(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+"  ");
        Number(n-1);

    

    }
   

    public static void main(String [] args){
        int n=10;
        Number(n);

    }
    
}
