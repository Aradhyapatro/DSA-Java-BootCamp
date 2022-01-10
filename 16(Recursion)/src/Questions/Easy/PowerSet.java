package Questions.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class PowerSet {
    public static void main(String[] args) {
        String s="abc";
        ArrayList<String> a=new ArrayList<>();
        powerSet(s,a,"");
        Collections.sort(a);
        System.out.println(a);
    }

    private static void powerSet(String s, ArrayList<String> a,String p) {

        if(s.length()==0){
//            System.out.println(p);
            if(p!="" && !a.contains(p)){
                a.add(p);
            }
            return;
        }

        for (int i = 0; i <= s.length(); i++) {
            powerSet(s.substring(1),a,p+s.charAt(0));
            powerSet(s.substring(1),a,p);
        }
    }
}
