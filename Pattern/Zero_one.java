package Pattern;

import java.util.Scanner;

public class Zero_one {
    public static void main(String []r){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");

                }
                
            }
            System.out.println();
        }
    }
    
}
