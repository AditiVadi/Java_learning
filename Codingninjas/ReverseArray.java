package Codingninjas;

import java.util.ArrayList;

public class ReverseArray {
    public static void reverseArray(ArrayList<Integer> arr, int m) {
        // Write your code here.
        for (int i = 0; i < arr.size(); i++) {

            if (i == m) {
                arr.set(m+1, i + 2);
            }
        }
        System.out.println(arr.get(m));
        System.out.println(arr);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int t = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        reverseArray(arr, 3);

    }
}
