package com.BackTracking;

public class MazeWithRestrictionWithFourDir_BackTracking {
    public static void main(String[] args) {
        boolean[][] track = {{true, true, true},
                {true, true, true},
                {true, true, true}};
        System.out.println(track[0][2]);
        maze("", track, 0, 0);
    }

    private static void maze(String s, boolean[][] track, int i, int j) {
        if (i == track.length - 1 && j == track[0].length - 1) {
            System.out.println(s);
            return;
        }

        if (!track[i][j]) {
            return;
        }

        track[i][j] = false;
        if (i<track.length-1) {
            maze(s+"R",track,i+1,j);
        }

        if (i>0) {
            maze(s+"L",track,i-1,j);
        }

        if (j>0) {
            maze(s+"T",track,i,j-1);
        }

        if (j<track[0].length-1) {
            maze(s+"B",track,i,j+1);
        }

        track[i][j] = true;
    }
}
