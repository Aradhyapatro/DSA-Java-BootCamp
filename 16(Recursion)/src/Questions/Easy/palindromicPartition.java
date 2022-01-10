package Questions.Easy;

import java.util.ArrayList;

public class palindromicPartition {
    public static void main(String[] args) {
        String s="nitin";
        ArrayList<String> arr=new ArrayList<>();
        partition("",s,arr);
        System.out.println(arr);
    }

    private static void partition(String s,String ss, ArrayList<String> arr) {
        if(ss.length()==0){
//            if(palindrome(s)){
//                arr.add(s);
//            }

            return;
        }

        if(palindrome(s)){
            arr.add(s);
        }

        partition(s+ss.charAt(0),ss.substring(1),arr);
        partition(s,ss.substring(1),arr);
    }

    private static boolean palindrome(String s) {
        if(s.length()==1){
            return true;
        }

        int start=0;
        int end=s.length()-1;

        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }

        return true;
    }
}
