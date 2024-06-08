package SesstionBYVishal.Day3;

public class InsertionSort {
    public static int[] inser(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[i - 1] > arr[j]) {
                    Swap(arr, i - 1, j);
                } else {
                    break;
                }
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
        int[] arr = { 1, 2, 5, 2, 3 };
        print(arr);
        print(inser(arr));
    }
}
