package DataTypes_Variables;
import java.util.*;
public class Average {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number which given your exam");
        int math=sc.nextInt();
        int sci=sc.nextInt();
        int sst=sc.nextInt();
        int avg=(math+sci+sst)/3;
        System.out.println("The average of the number in exam is "+avg);


        
    
    }
    
}
