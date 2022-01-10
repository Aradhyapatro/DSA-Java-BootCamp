package Questions.Easy;

public class BalanceParanthesis {
    public static void main(String[] args) {
        String s="{{[]}}";
        System.out.println(Balance(s,0,0,0));
    }

    private static boolean Balance(String s,int a ,int b,int c) {
        if(s.length()==0){
            if(a==0 && b==0 && c==0){
                return true;
            }else{
                return false;
            }
        }

        if(s.charAt(0)=='{'){
            a++;
        }else if(s.charAt(0)=='}'){
            a--;
        }else if(s.charAt(0)=='['){
            b++;
        }else if(s.charAt(0)==']'){
            b--;
        }else if(s.charAt(0)=='('){
            c++;
        }else{
            c--;
        }

        return Balance(s.substring(1),a,b,c);
    }
}
