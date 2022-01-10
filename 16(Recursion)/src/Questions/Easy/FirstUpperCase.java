package Questions.Easy;

public class FirstUpperCase {
    public static void main(String[] args) {
        String s="araDhya";
        System.out.println(firstUp(s,0));
    }

    private static char firstUp(String s,int i) {
        char c=s.charAt(i);
        if(Character.isUpperCase(c)){
            return c;
        }

        return firstUp(s,++i);
    }
}
