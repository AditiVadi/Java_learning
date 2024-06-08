public class CountingSort {
    // O(n+range)-linear time
    public static void Counting(int num[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            largest = Math.max(largest, num[i]);

        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < num.length; i++) {
            count[num[i]]++;
        }
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            while (count[i] > 0) {
                num[j] = i;
                j++;
                count[i]--;
            }
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
        int num[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        Counting(num);
        print(num);
    }
}
