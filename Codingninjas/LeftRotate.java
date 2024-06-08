package Codingninjas;

public class LeftRotate {
    public static int[] ans(int[] arr, int n) {

        int[] p = new int[n];
        for (int i = 0; i < n - 1; i++) {
            p[0] = arr[i + 1];
            p[i] = arr[i];
        }
        return p;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 3, 2 };
        System.out.println(ans(arr, 4));
    }
}
