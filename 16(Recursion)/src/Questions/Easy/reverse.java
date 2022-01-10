package Questions.Easy;

import java.util.Arrays;

class reverse {
    public static void main(String[] args) {
        char[] ch ={'H', 'a', 'n','i' ,'e', 'a', 'h'};
        reverseString(ch);
        System.out.println(Arrays.toString(ch));
    }

    static int s = 0;

    public static void reverseString(char[] ch) {
        if (s >= (ch.length / 2)) {
            return;
        }

        char t = ch[s];
        ch[s] = ch[ch.length - 1 - s];
        ch[ch.length - 1 - s] = t;
        s++;

        reverseString(ch);
    }
}