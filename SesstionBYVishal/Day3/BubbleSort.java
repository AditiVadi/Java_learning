package SesstionBYVishal.Day3;

public class BubbleSort {
    public static int[] bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean f = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    Swap(arr, j, j + 1);
                    f = true;
                }
            }
            if (!f) {
                break;
            }
        }
        return arr;
    }

    public static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 4 };
        print(arr);
        print(bubble(arr));
    }
}
