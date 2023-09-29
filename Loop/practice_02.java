package Loop;

import java.util.*;

public class practice_02 {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int sum_even = 0;
        int sum_odd=0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum_even += i;
            }
            else{

                sum_odd+=i;
            }
          
        }
        System.out.println("The sum of Even number is " + sum_even);
         System.out.println("The sum of Odd number is " + sum_odd);
    }

}
