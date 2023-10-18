package Arrays;

import java.util.Scanner;

public class User {

    public static void user(int n[]){
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum=sum+n[i];

        }
        System.out.println("The sum of the Number is ="+sum);
    }


    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size=sc.nextInt();
        int n[]=new int[size];

        for(int i=1;i<size;i++){
          n[i]=sc.nextInt(); 
        }
        user(n);

    }
    
}
