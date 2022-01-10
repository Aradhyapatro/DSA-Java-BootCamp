package com.BackTracking;

import java.util.Arrays;

public class AllPathPrint {
    public static void main(String[] args) {
        boolean[][] arr={{true,true,true},{true,true,true},{true,true,true}};
        int[][] path={{0,0,0},{0,0,0},{0,0,0}};
        maze("",arr,0,0,path,1);
    }

    private static void maze(String s,boolean[][] arr, int i, int j, int[][] path, int step) {
        if(!arr[i][j]) {
            return;
        }

        if(i==arr.length-1 && j==arr[0].length-1){
            path[i][j]=step;
            for (int k = 0; k < path.length; k++) {
                System.out.println(Arrays.toString(path[k]));
                System.out.println();
            }
            System.out.println(s+"\n");
        }

        arr[i][j]=false;
        path[i][j]=step;

        if(i<arr.length-1){
            maze(s+"D",arr,i+1,j,path,step+1);
        }

        if(i>0){
            maze(s+"T",arr,i-1,j,path,step+1);
        }

        if(j<arr[0].length-1){
            maze(s+"R",arr,i,j+1,path,step+1);
        }

        if(j>0){
            maze(s+"L",arr,i,j-1,path,step+1);
        }

        arr[i][j]=true;
        path[i][j]=0;
    }
}
