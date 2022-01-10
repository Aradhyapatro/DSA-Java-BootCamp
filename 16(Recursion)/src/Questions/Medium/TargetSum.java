package Questions.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1};
        ArrayList<Integer> a=new ArrayList<>();
        Find(arr,3,a,0,0);
        System.out.println(k.size());
    }

    static ArrayList<ArrayList<Integer>> k=new ArrayList<>();
    private static void Find(int[] arr, int n, ArrayList<Integer> a, int i,int sum) {
        if(i>arr.length-1) {
            if(sum==n && !k.contains(a)) {
                ArrayList<Integer> kk=new ArrayList<>(a);
                System.out.println(a);
                k.add(kk);
            }
            return;
        }

        a.add(arr[i]);
        Find(arr,n,a,i+1,sum+arr[i]);
        a.remove(a.size()-1);

        a.add(arr[i]*-1);
        Find(arr,n,a,i+1,sum-arr[i]);
        a.remove(a.size()-1);
    }


}

