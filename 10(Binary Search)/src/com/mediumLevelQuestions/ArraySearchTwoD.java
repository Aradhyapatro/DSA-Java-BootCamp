package com.mediumLevelQuestions;

public class ArraySearchTwoD {
    public static void main(String[] args) {
        int[][] arr= {{2}};
        System.out.println(searchMatrix(arr,3));
    }

    public static int BinarySearch(int[] arr,int target,int s,int e){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int start=0;
        int end=matrix.length-1;
        int cmid=matrix[0].length/2;

        if(matrix.length==1){
            if(BinarySearch(matrix[0],target,0,matrix[0].length-1)!=-1){
                return true;
            }else{
                return false;
            }
        }

        while(start<(end-1)){
            int mid=start+(end-start)/2;
            if(matrix[mid][cmid]>target){
                end=mid;
            }else if(matrix[mid][cmid]==target){
                return true;
            }else{
                start=mid;
            }
        }

        if(matrix[start][cmid]==target){
            return true;
        }

        if(matrix[start+1][cmid]==target){
            return true;
        }

        if(BinarySearch(matrix[start],target,0,cmid-1)!=-1){
            return true;
        }else if(BinarySearch(matrix[start],target,cmid+1,matrix[start].length-1)!=-1){
            return true;
        }else if(BinarySearch(matrix[end],target,0,cmid-1)!=-1){
            return true;
        }else if(BinarySearch(matrix[end],target,cmid+1,matrix[end].length-1)!=-1){
            return true;
        }

        return false;
    }
}
