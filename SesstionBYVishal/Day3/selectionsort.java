package SesstionBYVishal.Day3;

public class selectionsort {
    public static int[] sel(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int s = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[s] > arr[j]) {
                    s = j;
                }
                Swap(arr, i, s);// ama element swap thai che index nai
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
        int[] arr = { 1, 2, 34, 11, 6, 45, 23, 0 };
        print(sel(arr));

    }
}
