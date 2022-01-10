package Questions.Easy;

public class RemoveConsecutiveCharacter {
    public static void main(String[] args) {
        String s="aaddrraaa";
        s=remove(s);
        System.out.println(s);
    }

    private static String remove(String s) {
        if(s.length()==1){
            return s;
        }

        if(s.charAt(0)==s.charAt(1)){
            return remove(s.substring(0,1)+s.substring(2));
        }

        return s.charAt(0)+remove(s.substring(1));
    }
}
