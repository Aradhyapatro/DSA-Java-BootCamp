package com.CyclicQuestion;

import java.util.Arrays;

public class PositiveCycliceSort {
    public static void main(String[] args) {
        int[] arr={-4,-6,-7,0,3,2,5,1,6};
        System.out.println(PostiveMiss(arr));
    }

    public static int PostiveMiss(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int crt=arr[i];
            if(arr[i]<0)
            {
                continue;
            }
            else if(arr[i]!=arr[crt])
            {
                int temp=arr[i];
                arr[i]=arr[crt];
                arr[crt]=temp;
            }
            else if(arr[i]<0)
            {
                continue;
            }
        }
        System.out.println(Arrays.toString(arr));
        int j=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=0)
            {
                continue;
            }
            else
            {
                if(arr[i]!=j)
                {
                    return j;
                }
                else
                {
                    j++;
                }
            }
        }
        return 0;
    }
}
