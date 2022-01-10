package Questions.Easy;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        if(isSorted(arr,0)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }

    private static boolean isSorted(int[] arr, int i) {
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr,++i);
    }

}
