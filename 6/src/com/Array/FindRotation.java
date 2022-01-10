package com.Array;

public class FindRotation {
    public static boolean findRotation(int[][] mat, int[][] target) {

        int[][] arr=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                arr[i][j]=mat[j][i];
            }
        }

        boolean b=true;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[j][i]=arr[mat.length-j-1][i];
                if(mat[j][i]!=target[j][i])
                {
                    b=false;
                    break;
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        if(b)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int[][] arr={{0,1},{1,0}};
        int[][] target={{1,0},{0,1}};
        System.out.println(findRotation(arr,target));
    }


}
