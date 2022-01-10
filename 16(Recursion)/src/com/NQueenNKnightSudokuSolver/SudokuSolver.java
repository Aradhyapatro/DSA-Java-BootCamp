package com.NQueenNKnightSudokuSolver;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {0, 0, 6, 5, 7, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        Solve(board,0,0);
    }

    private static void Solve(int[][] board, int r, int c) {

        if(r>=board.length || c>=board.length){
            display(board);
            return;
        }

        if(board[r][c]==0) {

            for (int i = 1; i <= 9; i++) {
                if(isSafe(board,r,c,i)){
                    board[r][c]=i;

                    if(c==board.length-1){
                        Solve(board,r+1,0);
                    }else{
                        Solve(board,r,c+1);
                    }

                    board[r][c]=0;   //backtracking
                }
            }
        }else{
            if(c==board.length-1){
                Solve(board,r+1,0);
            }else{
                Solve(board,r,c+1);
            }
        }
    }

    private static void display(int[][] board) {
        for (int[] arr:board) {
            System.out.println(Arrays.toString(arr));
        }
    }


    public static boolean isSafe(int[][] board,int r,int c,int num){

//        row
        for (int i = 0; i < board.length; i++) {
            if(board[r][i]==num){
                return false;
            }
        }

//        colomns
        for (int i = 0; i < board.length; i++) {
            if (board[i][c]==num){
                return false;
            }
        }

//        small Box
        int l= (int) Math.sqrt(board.length);
        int cols=c-c%l;
        int rows=r-r%l;
        for (int i = rows; i < rows+l; i++) {
            for (int j = cols; j < cols+l; j++) {
                if(board[i][j]==num){
                    return false;
                }
            }
        }

        return true;
    }
}
