package Revision_array;

import java.util.Scanner;

public class RainWater {

    public static void trap(int height[]){
        int n=height.length;

             // left side max
        int leftmax[]=new int [n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);

        }

        // right side max

        int rightmax[]=new int [n];
        rightmax[n-1]= height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);

        }


        int trapwater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftmax[i],rightmax[i]);
            trapwater+=(waterLevel-height[i]);
        }
        System.out.println("Total amount of the trapewater "+trapwater);
    }

    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of the Building");
       int size=sc.nextInt();
       int n[]=new int[size];
       System.out.println("Enter the height of the building");
       for(int i=0;i<size;i++){
        n[i]=sc.nextInt();
       }
       trap(n);

    }


      
    
}
