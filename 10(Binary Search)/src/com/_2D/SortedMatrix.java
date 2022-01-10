package com._2D;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        int target = 10;
        System.out.println(Arrays.toString(SearchInSortedArray(arr, target)));
    }

    public static int[] BinarySearch(int[][] arr, int target, int r, int start, int end) {
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[r][mid] == target)
                return new int[]{r, mid};
            else if (arr[r][mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return new int[]{-1, -1};
    }

    public static int[] SearchInSortedArray(int[][] arr, int target) {
        int r = arr.length;
        int c = arr[0].length;

        if (c == 0)
            return new int[]{-1, -1};

        if (r == 1) {
            return BinarySearch(arr, target, r, 0, c);
        }

        int rs = 0;
        int re = arr.length - 1;
        int cmid = c / 2;

        while (rs < (re - 1)) {
            int mid = rs + ((re - rs) / 2);
            if (arr[mid][cmid] == target)
                return new int[]{mid, cmid};
            else if (arr[mid][cmid] > target)
                re = mid;
            else
                rs = mid;
        }

// check whether the target is in the col of 2 rows
        if (arr[rs][cmid] == target) {
            return new int[]{rs, cmid};
        }
        if (arr[rs + 1][cmid] == target) {
            return new int[]{rs + 1, cmid};
        }

        if(arr[rs][0]<=target && arr[rs][cmid-1]>=target)
            return BinarySearch(arr,target,rs,0,cmid-1);

        if(arr[rs][cmid+1]<=target && arr[rs][c-1]>=target)
            return BinarySearch(arr,target,rs,cmid+1,c-1);

        if (arr[rs+1][0]<=target && arr[rs+1][cmid-1]>=target)
            return BinarySearch(arr,target,rs+1,0,cmid-1);

        if (arr[rs+1][cmid+1]<=target && arr[rs+1][c-1]>=target)
            return BinarySearch(arr,target,rs+1,cmid+1,c-1);


        return new int[]{-1,-1};
    }
}
