package Questions.Medium;

import java.util.ArrayList;

public class CombinationSum {
    public static void main(String[] args) {
        int[] num = {2,3,5};
        ArrayList<Integer> a = new ArrayList<>();
        find(0, num, a, 8, 0);
        System.out.println(aa);
    }

    static ArrayList<ArrayList<Integer>> aa = new ArrayList<>();

    private static void find(int n, int[] num, ArrayList<Integer> a, int limit, int index) {
        if (n > limit || index > num.length - 1) {
            return;
        }

        if (n == limit) {
//            System.out.println(a);
            ArrayList<Integer> temp=new ArrayList<>(a);
            if (!aa.contains(temp)) {

                aa.add(temp);
            }
            return;
        }


        a.add(num[index]);
        find(n + num[index], num, a, limit, index + 1);
        a.remove(a.size() - 1);

        find(n, num, a, limit, index + 1);

        a.add(num[index]);
        find(n + num[index], num, a, limit, index);
        a.remove(a.size() - 1);

    }
}
