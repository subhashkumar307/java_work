import java.util.*;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveArr {
    public static void main(String[] args) {
        int a[] = {3, 9, 2, 3, 1, 7, 2, 3, 5};
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        for (int no : hs) {
            System.out.print(no + " ");
        }
    }
}






