package com.AradhyaPatro;

public class Pattern31 {

  public static void main(String[] args) {
    int n = 4;
    //        int[][] a=new int[(2*n-1)][(2*n-1)];
    //        int cs=0,rs=0,ce=a[0].length-1,re=a.length-1;
    //        while (cs<=ce && rs<=re){
    //            for (int i = cs; i <= ce; i++) {
    //                a[rs][i]=n;
    //            }
    //
    //            for (int i = cs; i <= ce; i++) {
    //                a[re][i]=n;
    //            }
    //
    //            for (int i = rs; i <= re; i++) {
    //                a[i][cs]=n;
    //            }
    //
    //            for (int i = rs; i <= re; i++) {
    //                a[i][ce]=n;
    //            }
    //
    //            cs++;
    //            ce--;
    //            rs++;
    //            re--;
    //            n--;
    //        }
    //
    //        for (int i = 0; i < a.length; i++) {
    //            for (int j = 0; j < a[i].length; j++) {
    //                System.out.print(a[i][j]);
    //            }
    //            System.out.println();
    //        }

    System.out.println("\n");
    pattern(n);
  }

  public static void pattern(int n) {
    for (int i = 0; i <= (2 * n); i++) {
      for (int j = 0; j <= (2 * n); j++) {
        System.out.print(n-Math.min(Math.min(i,j),Math.min((2*n)-i,(2*n)-j)));
      }
      System.out.println();
    }
  }

  public static int data(int n, int i, int j) {
    int a = n - i;
    int b = n - j;
    int c = i - 0;
    int d = j - 0;

    return mini(a, b, c, d);
  }

  public static int mini(int a, int b, int c, int d) {
    if (a < b && b < c && c < d) {
      return a;
    } else if (b < a && a < c && c < d) {
      return b;
    } else if (c < a && a < b && b < d) {
      return c;
    } else {
      return d;
    }
  }
}
