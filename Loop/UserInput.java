package Loop;

import java.util.Scanner;

public class UserInput {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Last Number");
        int z=sc.nextInt();
        for(int i=1;i<=z;i++){
            System.out.println(i);
        }
    }
    
}
