package Questions.Easy;

public class GeekonomicSeries {
    public static void main(String[] args) {
        System.out.println(geek(1,3,2,6));
    }

    private static int geek(int a, int b, int c, int n) {
        if(n==1){
            return a;
        }else if(n==2){
            return b;
        }else if(n==3){
            return c;
        }

        return geek(a,b,c,n-1)+geek(a,b,c,n-2)+geek(a,b,c,n-3);

    }
}
