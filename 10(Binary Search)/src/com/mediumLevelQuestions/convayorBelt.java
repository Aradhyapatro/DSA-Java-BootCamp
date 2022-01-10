package com.mediumLevelQuestions;

public class convayorBelt {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(arr,5));
    }

    public static int shipWithinDays(int[] arr, int days) {
        int max=0;
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            sum+=arr[i];
        }

        int s=max;
        int e=sum;
        while(s<e)
        {
            int mid=s+(e-s)/2;
            int c=1;
            int tsum=0;
            for(int i=0;i<arr.length;i++)
            {
                if(tsum+arr[i]>mid){
                    tsum=arr[i];
                    c++;
                }
                else{
                    tsum+=arr[i];
                }
            }

            if(c>days){
                s=mid+1;
            }else{
                e=mid;
            }
        }
        return e;
    }
}
