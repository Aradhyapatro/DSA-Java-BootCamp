package Questions.Easy;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,0};
        System.out.println(findmax(arr,arr.length-1));
    }

    private static int findmin(int[] arr, int length) {
        if(length==1){
            return arr[0];
        }

        return Math.min(arr[length],findmin(arr,length-1));
    }

    private static int findmax(int[] arr, int length) {
        if(length==1){
            return arr[0];
        }

        return Math.max(arr[length],findmax(arr,length-1));
    }
}
