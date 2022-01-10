package Questions.Medium;

import java.util.Scanner;

public class NDigitNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="1";
        for (int i = 1; i < n; i++) {
            s+='0';
        }
        int m=Integer.parseInt(s);
        s+="0";
        int k=Integer.parseInt(s);
        recur(m,k);
//        System.out.println(m);
    }

    private static void recur(int m, int k) {
        if(m==k) return;

        System.out.print(m+" ");
        recur(m+1,k);
    }


}
