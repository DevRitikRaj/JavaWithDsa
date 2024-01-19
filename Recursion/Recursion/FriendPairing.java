package Recursion;

public class FriendPairing {
    public static int Pair(int n){
        // Base Case
        if(n==1 || n==2){
            return n;

        }

        //for Single 
        int fnm1=Pair(n-1);


        // for pair

        int fnm2=Pair(n-2);

        // Total ways

        int Totalways=fnm1+ (n-1)*fnm2;
        return Totalways;
    }

    public static void main(String [] args){
        int n=3;
        System.out.println("There is "+Pair(n)+" Ways");
    }
    
}
