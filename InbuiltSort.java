import java.util.Arrays;
import java.util.Collections;
//import java.util.*;

public class InbuiltSort {
    public static void print(Integer arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Integer thi object bane
    public static void main(String[] args) {
        Integer num[] = { 5, 4, 1, 3, 2 };
        // Arrays.sort(num);
        Arrays.sort(num, 0, 2);
        Arrays.sort(num, Collections.reverseOrder());
        print(num);
    }
}
