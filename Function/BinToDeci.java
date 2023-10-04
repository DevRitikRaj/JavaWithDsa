package Function;
import java.util.*;
public class BinToDeci {

    public static void Binary(int n){
        int pow=0;
        int dec=0;
        while(n>0){
            int ld=n%10;
            dec= dec+ ld* (int) Math.pow(2, pow);
            pow++;
            n=n/10;
        }
        System.out.println(dec);
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Binary");
        int num=sc.nextInt();
        Binary(num);
    }
    
}
