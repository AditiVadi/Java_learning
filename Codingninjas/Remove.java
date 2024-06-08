package Codingninjas;

public class Remove {
    public static int ans(int a[], int n) {
        int c = 0;
        for (int j = 1; j < n; j++) {
            if (a[j] != a[c]) {
                a[c + 1] = a[j];
                c++;

            }
        }
        return c + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 3, 4, 4, 5, 5 };
        System.out.println(ans(arr, 10));
    }
}
