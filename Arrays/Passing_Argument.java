package Arrays;
import java.util.*;
public class Passing_Argument {

    public static void Array_Arg(int marks[]){
        for(int i=0;i<marks.length;i++){
             marks[i]= marks[i]+1;
        }
    }

    public static void main(String [] args){
        int marks[]={1,2,3};
        Array_Arg(marks);

        // print our marks

        for(int i=0;i<marks.length;i++){
            System.out.print( marks[i]+" ");
        }
        System.out.println();

    }
    
}
