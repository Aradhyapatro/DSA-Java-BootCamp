package com.BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        maze("",0,0,2,2);
        System.out.println(mazeList("",0,0,2,2));
    }

    private static int mazeCount(int i, int j, int fi, int fj) {
        if(i>fi || j>fj){
            return 0;
        }

        if(i==fi && j==fj){
            return 1;
        }

        return mazeCount(i+1,j,fi,fj) + mazeCount(i,j+1,fi,fj);
    }

    private static void maze(String s,int i, int j, int fi, int fj) {
        if(i>fi || j>fj){
            return;
        }

        if(i==fi && j==fj){
            System.out.println(s);
            return;
        }

        maze(s+"R",i+1,j,fi,fj);
        maze(s+"D",i,j+1,fi,fj);
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
        arr.addAll(mazeList(s+"D",i,j+1,fi,fj));
        return arr;
    }
}
