package com.EasyLevelQuestions;

public class CountNumberOfNegetiveElementInMatrix {
    public static void main(String[] args) {
        int[][] arr={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(ElenemtFound(arr));
    }

    private static int ElenemtFound(int[][] arr) {
        int col=0;
        int row=arr.length-1;
        int c=0;
        while(row>=0 && col<arr[0].length){
            if(arr[row][col]<0){
                c+=(arr[0].length-col);
                row--;
            }else{
                col++;
            }
        }
        return c;
    }


}
