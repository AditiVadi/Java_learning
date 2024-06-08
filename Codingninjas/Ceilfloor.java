package Codingninjas;

public class Ceilfloor {
    public static int[] fun(int arr[], int x) {
        int ceil = -1;
        int floor = -1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                floor = arr[i];
            } else {
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= x) {
                ceil = arr[i];
            } else {
                break;
            }
        }
        return new int[] { floor, ceil };
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 4, 7, 8, 10 };
        System.out.println(fun(arr, 8));
    }
}