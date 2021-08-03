import java.util.Arrays;
import java.util.Collections;
public class SmallestNum {
    //Element in a given array
    public static int kthSmallest(Integer[] arr, int k)
    {
        //Sort the given array
        Arrays.sort(arr);

        //Return k th element in the sorted array
        return arr[k - 1];
    }
     //Driver Program
    public static void main(String[] args) {
        Integer arr[] = new Integer[] {7, 10, 4, 3, 20, 15 };
        int k = 3;
        //Integer arr[] = new Integer[] {7, 10, 4, 3, 20, 15 };
        //int k = 4;
        System.out.println("K element is " + kthSmallest(arr, k));
    }
}
