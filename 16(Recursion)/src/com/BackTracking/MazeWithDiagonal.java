package com.BackTracking;

import java.util.ArrayList;

public class MazeWithDiagonal {
    public static void main(String[] args) {
//        maze("",0,0,2,2);
        System.out.println(mazeList("",0,0,2,2));
    }

    private static ArrayList<String> mazeList(String s, int i, int j, int fi, int fj) {
        if(i>fi || j>fj){
            return new ArrayList<String>();
        }

        if(i==fi && j==fj){
            ArrayList<String> arr=new ArrayList<>();
            arr.add(s);
            return arr;
        }

        ArrayList<String> arr=new ArrayList<>();
        arr.addAll(mazeList(s+"R",i+1,j,fi,fj));
        arr.addAll(mazeList(s+"B",i,j+1,fi,fj));
        arr.addAll(mazeList(s+"D",i+1,j+1,fi,fj));
        return arr;
    }
}
