package Revision_array;

import java.util.Scanner;

public class one {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Element");
        int size=sc.nextInt();
        int marks[]=new int[size];
        System.out.println("Enter the Element of the Array");
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();

        }
        System.out.println("The Element Of the Array");
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
        
    }
}
