package Questions.Easy;

public class lengthOfString {
    public static void main(String[] args) {
        String s="aradhya";
        System.out.println(len(s));
    }

    private static int len(String s) {
        if(s.length()==1){
            return 1;
        }

        return len(s.substring(1))+1;
    }
}
