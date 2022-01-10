package com.BackTracking;

public class MazeWithRestriction {
    public static void main(String[] args) {
        boolean[][] track={{true,true,true},
                            {true,true,true},
                            {false,true,true}};
        System.out.println(track[0][2]);
        maze("",track,0,0);
    }

    private static void maze(String s, boolean[][] track,int i,int j) {
        if(i>track.length-1 || j>track[0].length-1){
            return;
        }

        if(!track[i][j]){
            return;
        }

        if(i == track.length - 1 && j == track[0].length - 1){
            System.out.println(s);
            return;
        }

        maze(s+"R",track,i+1,j);
        maze(s+"D",track,i,j+1);
    }
}
