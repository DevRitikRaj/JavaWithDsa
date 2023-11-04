package Array2d;

import java.util.Scanner;

public class sumtwoline {
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int StartRow=0;
        System.out.println("Enter the Row");
        int n=sc.nextInt();
        System.out.println("Enter the Column");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0;
        int row = 2;
        for(int j=0;j<matrix.length;j++){
            sum += matrix[row-1][j];
            }
            System.out.println(sum);
        }

       
        



    }

