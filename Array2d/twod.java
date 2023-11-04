package Array2d;

import java.util.Scanner;

public class twod {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int key=8;
        int count=0;
        int matrix[][]=new int[2][3];
        int n=matrix.length;
        int m=matrix[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(+matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(key==matrix[i][j]){
                    count++;
                    
                }
               
                
            }
             
            
        }
        System.out.println(count);
        

    }
    
}
