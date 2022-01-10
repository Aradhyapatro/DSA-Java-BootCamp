package Questions.Easy;

import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        print(arr);
    }

    private static void print(int[] arr) {
        if(arr.length==1){
            System.out.println(Arrays.toString(arr));
            return;
        }

        int[] a=new int[arr.length-1];
        for (int i = 0; i < a.length; i++) {
            a[i]=arr[i]+arr[i+1];
        }

        print(a);

        System.out.println(Arrays.toString(arr));
    }
}
