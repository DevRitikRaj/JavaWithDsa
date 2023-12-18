package Revision_array;

import java.util.Scanner;

public class reverse {

    public static void rev(int n[]){

        int first=0,last=n.length-1;
        while(first<=last){
            int temp=n[first];
            n[first]=n[last];
            n[last]=temp;
            first++;
            last--;
        }
    }

    public static void printarr(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int n[]=new int[size];
        for(int i=0;i<size;i++){
            n[i]=sc.nextInt();
        }
        printarr(n);
        rev(n);
        printarr(n);

        
    }
    
}
