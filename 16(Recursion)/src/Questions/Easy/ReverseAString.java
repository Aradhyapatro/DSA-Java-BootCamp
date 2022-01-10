package Questions.Easy;

import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {
        char[] ch={'a','r','y','a'};
        reverse(ch,0,ch.length-1);
        System.out.println(Arrays.toString(ch));
    }

    private static void reverse(char[] ch,int s,int e) {
        if(s>e){
            return;
        }

        char t=ch[s];
        ch[s]=ch[e];
        ch[e]=t;

        reverse(ch,s+1,e-1);
    }
}
