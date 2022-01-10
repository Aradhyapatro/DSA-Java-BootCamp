package Questions.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class lexicography {
    public static void main(String[] args) {
        String s="abc";
        ArrayList<String> arr=new ArrayList<>();
        find("",s,arr);
        Collections.sort(arr);
        System.out.println(arr);
    }

    private static void find(String s, String s1, ArrayList<String> arr) {

        if(s1.length()==0){
            if(!arr.contains(s) && s!=""){
                arr.add(s);
            }
            return;
        }

        for (int i = 0; i < s1.length(); i++) {
            s+=s1.charAt(i);

            String ss1=s1.substring(0,i)+s1.substring(i+1);
            find(s,ss1,arr);

            s=s.substring(0,s.length()-1);
            find(s,ss1,arr);
        }
    }
}
