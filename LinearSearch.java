import java.util.*;

public class LinearSearch {

    public static int search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            } else {
                return -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter 5 element:");
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
