package Loop;

import java.util.*;

public class user_loop_mul_10 {
    public static void main(String []m){
          Scanner sc=new Scanner(System.in);
        
          do{
            System.out.println("Enter the number");
            int n=sc.nextInt();
            if(n%10==0){
                break;            
            }
            System.out.println(n);
          }while(true);

    }

}
