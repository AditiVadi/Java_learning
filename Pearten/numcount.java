package Pearten;

import java.util.HashSet;
import java.util.Set;

public class numcount {
    public static int count(int arr[], int a) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 5, 5, 5, 5, 5 };
       
        Set<Integer> hash_Set = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            hash_Set.add(arr[i]);
        }
        System.out.println(count(arr, hash_Set[]));

    }
}
