package com.Question;

public class ceil {
    public static void main(String[] args) {
        int[] arr={0,1,4,6,19,44,55,67,69,70,75,77};
        System.out.println(nextGreatestElementEqualOrGreater(arr,67));
    }

    public static int nextGreatestElementEqualOrGreater(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=start+((end-start)/2);
            if(target==arr[mid])
                return arr[mid];
            else if(target>arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return arr[start];
    }
}
