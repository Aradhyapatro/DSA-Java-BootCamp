package com.NQueenNKnightSudokuSolver;

public class N_Knight {
    public static void main(String[] args) {
        int n=4;
        boolean[][] arr=new boolean[n][n];
        Knight(arr,0,0,n);
    }

    private static void Knight(boolean[][] arr, int r, int c,int knights) {
        if(knights==0){
            display(arr);
            System.out.println();
            return;
        }

        if(r==arr.length-1 && c==arr.length){
            return;
        }
        
        if (c==arr[0].length){
            Knight(arr,r+1,0,knights);
            return;
        }



        if(isSafe(arr,r,c)){
            arr[r][c]=true;
            Knight(arr,r,c+1,knights-1);
            arr[r][c]=false;
        }

        Knight(arr,r,c+1,knights);

    }

    private static boolean isSafe(boolean[][] arr, int r, int c) {
//        top
        if(r-2>=0){
            if(c-1>=0){
                if(arr[r-2][c-1]){
                    return false;
                }
            }

            if(c+1<arr[0].length){
                if (arr[r-2][c+1]){
                    return false;
                }
            }
        }

//        bottom
        if(r+2<arr.length){
            if(c-1>=0){
                if(arr[r+2][c-1]){
                    return false;
                }
            }

            if(c+1<arr[0].length){
                if (arr[r+2][c+1]){
                    return false;
                }
            }
        }

//        right
        if (c+2<arr[0].length){
            if (r-1>=0){
                if (arr[r-1][c+2]) {
                    return false;
                }
            }

            if(r+1<arr.length){
                if (arr[r+1][c+2]){
                    return false;
                }
            }
        }

//        left
        if(c-2>=0){
            if(r-1>=0){
                if(arr[r-1][c-2]){
                    return false;
                }
            }

            if (r+1<arr.length){
                if(arr[r+1][c-2]){
                    return false;
                }
            }
        }

        return true;
    }

    private static void display(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[0].length;j++){
                if (arr[i][j]==true){
                    System.out.print("K");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
