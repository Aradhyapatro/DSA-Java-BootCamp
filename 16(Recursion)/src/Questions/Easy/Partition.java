package Questions.Easy;

import java.util.ArrayList;

public class Partition {
    public static void main(String[] args) {
        String s = "geeks";
        ArrayList<String> ss = new ArrayList<>();
        partition(s, ss, "");
        System.out.println(ss);
    }

    private static void partition(String s, ArrayList<String> ss, String test) {
        if (s.length() == 0) {
            if (isPalindrome(test)) {
                if (test != "") {
//                    System.out.print(" "+test+" ");
                    ss.add(test);
                }
//                System.out.println();
                test="";
            }
            System.out.println(ss);
            return;
        }

        test += s.charAt(0);
        String temp = test;
        if (isPalindrome(test)) {
            if (test != "") {
//                System.out.print(" "+test+" ");
                ss.add(test);
            }
            test = "";
            partition(s.substring(1), ss, test);
        }
        test = temp;
//        System.out.println(test);
        partition(s.substring(1), ss, test);

    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
