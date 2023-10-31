package Array2d;

import java.util.Scanner;

public class first {

    public static void Search(int a[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]>=max){
                    max=a[i][j];
                    
                }
            }
           
        }
         System.out.println("The maximum Number is"+max);

      
        
    }

    





    public static void main(String [] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of the Row");
         int n=sc.nextInt();
         System.out.println("Enter the size of the Column");
         int m=sc.nextInt();
         System.out.println("Enter the Array");
         
         



        int matrix[][]=new int [n][m];       

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //Output

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
                 

            }
            System.out.println();
           
            

            
        }
         Search(matrix);
       

    }
    

    
    
}
