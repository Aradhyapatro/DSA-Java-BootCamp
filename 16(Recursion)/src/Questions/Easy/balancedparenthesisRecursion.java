package Questions.Easy;

public class balancedparenthesisRecursion {
    public static void main(String[] args) {
        String s="(){[]}(([()()]))";
        System.out.println(find(s));
    }

    static int a1=0,a2=0,b1=0,b2=0,c1=0,c2=0;
    private static boolean find(String s) {
        if(s.length()==0){
            if((a1-a2+b1-b2+c1-c2)==0){
                return true;
            }
        }

        if(s.charAt(0)=='['){
            a1++;
        }else if(s.charAt(0)=='('){
            b1++;
        }else if(s.charAt(0)=='{'){
            c1++;
        }else if(s.charAt(0)==')'){
            if(b1>b2){
                b2++;
            }else{
                return false;
            }
        }else if(s.charAt(0)==']'){
            if(a1>a2){
                a2++;
            }else{
                return false;
            }
        }else if(s.charAt(0)=='}'){
            if(c1>c2){
                c2++;
            }else{
                return false;
            }
        }

        return find(s.substring(1));
    }
}
