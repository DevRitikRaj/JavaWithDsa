package Function;
import java.util.*;
public class Natural_sum {
    public static int Sum_add(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            sum=sum+i;
        }
        return sum;
    }
    

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the natural number");
        int a=sc.nextInt();
        int add=Sum_add(a);
        System.out.println(add);

    }
    
}
