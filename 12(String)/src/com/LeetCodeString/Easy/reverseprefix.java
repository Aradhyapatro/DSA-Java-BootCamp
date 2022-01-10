package String;

public class reverseprefix {

  public static void main(String[] args) {
    // main function
    String s = "abcd";
    char ch = 'z';
    System.out.println(rev(s, ch));
  }

  private static String rev(String s, char ch) {
    int c = -1;
    for (int i = 0; i < s.length(); i++) {
      if (i != s.length() - 1 && s.charAt(i) != ch) {
        c++;
      } else if (i <= s.length() - 1 && s.charAt(i) == ch) {
        break;
      } else {
        return s;
      }
    }

    if (c == -1) {
      return s;
    } else {
      StringBuilder ss = new StringBuilder(s.substring(0, c + 2));
      ss.reverse();
      return ss.toString().concat(s.substring(c + 2));
    }
  }
}
