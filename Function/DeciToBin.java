package Function;
import java.util.*;
public class DeciToBin {

    public static void DB(int n){
        int pow=0;
        int bin=0;
        while(n>0){
            int rem=n%2;
            bin=bin+ rem * (int) Math.pow(10, pow);
            pow++;
            n=n/2;
        }
        System.out.println(bin);
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Binary Number");
        int num=sc.nextInt();
        DB(num);
    }
   
}

