package DataTypes_Variables;
import java.util.*;

public class Tax {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Cost of Pencil");
        float pencil=sc.nextFloat();
          System.out.println("Enter the Cost of Pen");
        float pen=sc.nextFloat();
          System.out.println("Enter the Cost of eraser");
        float eraser=sc.nextFloat();
        float total=(pen+pencil+eraser);
        float tax=(total*18) /100;
        float total_amount=total+tax;
        System.out.println(total_amount);


    }
    
}
