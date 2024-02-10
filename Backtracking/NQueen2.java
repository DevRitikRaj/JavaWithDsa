package Backtracking;

public class NQueen2 {


    public static boolean isSafe(char board[][],int row, int col){


        //verticall left

        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }

        }

        // Daigonally

        for(int i=row-1 , j=col-1;i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }

        }

        // Right 

            for(int i=row-1, j=col+1;i>=0 && j<board.length;i--,j++){
                if(board[i][j]=='Q'){
                    return false;
                }
            }

            return true;

       
    }


    public static void nQueen(char board[][],int row){
        // Base Case
        if(row==board.length){
            // PrintBoard(board);
            count ++;
            return;
        }
        // Column Case or Backtracking
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                nQueen(board, row+1);
                board[row][j]='*';
            }
        }

    }

    static int count =0;


    public static void PrintBoard(char board[][]){
        System.out.println("----------------Chess Board=================");

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }



    public static void main(String [] args){
       
        int n=5;
        char board[][]=new char [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='*';

            }
        }

        nQueen(board, 0);
        System.out.println("The Total Number of the Possible to the queen "+count);
    }
    
}
