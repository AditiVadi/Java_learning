public class SelectionSort {
    // O(n^2)
    public static void Selection(int num[]) {
        int n = num.length;
        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (num[minPos] < num[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = num[minPos];
            num[minPos] = num[i];
            num[i] = temp;
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
        Selection(num);
        print(num);
    }
}
