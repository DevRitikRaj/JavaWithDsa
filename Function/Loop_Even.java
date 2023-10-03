package Function;
import java.util.*;

import javax.xml.crypto.dsig.spec.XPathType.Filter;

public class Loop_Even {
    
    public static void Filter1(int num){
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
       

    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       Filter1(num);
    }
}
