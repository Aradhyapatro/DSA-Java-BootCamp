package String;

public class mergeStrings {

  public static void main(String[] args) {
    // main function
    String s1 = "abc2", s2 = "pqr0000";
    System.out.println(alter(s1, s2));
  }

  private static String alter(String s1, String s2) {
    int i = 0, j = 0, k = 0;
    StringBuilder ss = new StringBuilder("");
    while (i < s1.length() && j < s2.length()) {
      ss.insert(k, s1.charAt(i));
      k++;
      ss.insert(k, s2.charAt(j));
      k++;
      i++;
      j++;
    }

    while (i < s1.length()) {
      ss.insert(k, s1.charAt(i));
      k++;
      i++;
    }

    while (j < s2.length()) {
      ss.insert(k, s2.charAt(j));
      k++;
      j++;
    }

    return ss.toString();
  }
}
