package Recursion;

public class LastOccurrence {
    public static int last(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = last(arr, key, i + 1);
        if (isfound != -1) {
            return isfound;
        }
        // check with self
        if (arr[i] == key) {
            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(last(arr, 5, 0));
    }
}
