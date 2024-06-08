import java.util.*;

public class BinarySearch {

    public static int search(int arr[], int key) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (key == arr[mid]) {
                return mid;

            } else if (key < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element number:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter " + n + " elements in sortedmanear:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("enter a elemrnt that you wont to search:");
        int key = sc.nextInt();
        int ans = search(arr, key);
        if (ans == -1) {
            System.out.println("Element Not found");
        } else
            System.out.println("Element is at index:" + ans);
    }
}
