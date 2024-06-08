package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class DuplicateZeros1089 {
    public static void duplicateZeros(int[] arr) {

        List<Integer> al = new ArrayList<Integer>();
        for (Integer a : arr)
            al.add(a);
        int n = al.size();
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == 0) {
                al.set(i, 0);
                al.remove(n - 1);
            }

        }
        System.out.println(al);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
    }
}
