package Revision_array;

import java.util.Scanner;

public class t2 {

    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int size=sc.nextInt();
        int marks[]= new int[size];
        System.out.println("Enter the Number");
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        update(marks);
        System.out.println("Increase Element are");
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }


      
    }
    
}
