package Arrays;

import java.util.Scanner;

public class Practice_04{
    public static int TW(int height[]){
        int n=height.length;

        //left corner

        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        //right corner

        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }

        int trapwater=0;

        for(int i=0;i<n;i++){
            int WL=Math.min(leftMax[i],rightmax[i]);
            trapwater +=WL-height[i];
        }
        return trapwater;

       
        

    }


    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the height of the wall");
        int n=sc.nextInt();
        System.out.println("Enter the height of the wall");
        int height[]=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        System.out.println("The total water is trapper is "+TW(height));

    }
   
}