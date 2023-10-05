package Function;

import java.util.Scanner;

public class OddEven {
    boolean Check =true;

    public static boolean Check(int n){

        if(n%2==0){
            return true;
        }

        return false;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        System.out.println(Check(n));
    }
    


    
}
