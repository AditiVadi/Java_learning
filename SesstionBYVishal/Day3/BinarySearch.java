package SesstionBYVishal.Day3;

public class BinarySearch {
    public static int bin(int[] arr, int e) {

        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == e) {
                return mid;
            } else if (arr[mid] < e) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 7, 9, 12, 13 };
        System.out.println(bin(arr, 12));
    }

}