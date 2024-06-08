public class InsertionSort {
    // O(n^2)
    public static void InsertionSort(int num[]) {
        int n = num.length;
        for (int i = 0; i < n; i++) {
            int curr = num[i];
            int prev = i - 1;
            // finding out thr correct pos to insert
            while (prev >= 0 && num[prev] > curr) {
                num[prev + 1] = num[prev];
                prev--;
            }
            // insertion
            num[prev + 1] = curr;
        }
    }

    public static void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num[] = { 5, 4, 1, 3, 2 };
        InsertionSort(num);
        print(num);
    }
}
