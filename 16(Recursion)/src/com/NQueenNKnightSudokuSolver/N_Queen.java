package com.NQueenNKnightSudokuSolver;

public class N_Queen {
    public static void main(String[] args) {
        int n=8;
        boolean[][] board=new boolean[n][n];
        System.out.println(Queen(board,0));
    }

    private static int Queen(boolean[][] board, int r) {
        if(r==board.length){
            display(board);
            return 1;
        }

        int c=0;

        for (int i = 0; i < board[0].length; i++) {

            if(isSafe(board,r,i)){
                board[r][i]=true;
                c+=Queen(board,r+1);
                board[r][i]=false;
            }

        }

        return c;
    }

    private static boolean isSafe(boolean[][] board,int r,int c) {
//        vertical
        for (int i = 0; i <= r; i++) {
            if(board[i][c]){
                return false;
            }
        }

//        left diagonal
        int n=Math.min(r,c);
        for (int i = 1; i <= n; i++) {
            if(board[r-i][c-i]){
                return false;
            }
        }

//        right diagonal
        n=Math.min(r,board.length-c-1);
        for (int i = 1; i <= n; i++) {
            if(board[r-i][c+i]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]==true){
                    System.out.print("Q");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
