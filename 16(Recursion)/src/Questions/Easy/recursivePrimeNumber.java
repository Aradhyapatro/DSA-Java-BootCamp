package Questions.Easy;

public class recursivePrimeNumber {
    public static void main(String[] args) {
        if(prime(10,2)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }

    private static boolean prime(int n,int i) {
        if(n%2==0){
            return false;
        }else if(n%i==0){
            return false;
        }else if(i*i<n){
            return true;
        }

        return prime(n,i+1);
    }


}
