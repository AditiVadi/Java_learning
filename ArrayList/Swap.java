package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {
    public static void swap(ArrayList<Integer> l, int i1, int i2) {
        int temp = l.get(i1);
        l.set(i1, l.get(i2));
        l.set(i2, temp);

    }

    public static boolean isAnagram(String str1, String str2) {
        // Your code goes here
        ArrayList<String> l = new ArrayList<>();
        l.add(str1);
        l.add(str2);
        Collections.sort(l);
        System.out.println(l);
        if (str1 == str2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // ArrayList<Integer> l = new ArrayList<>();
        // l.add(1);
        // l.add(12);
        // l.add(3);
        // l.add(4);

        // int i1 = 1, i2 = 3;
        // System.out.println(l);
        // swap(l, i1, i2);
        // System.out.println(l);
        // // sort in ArrayList
        // Collections.sort(l);
        // System.out.println(l);// ascending

        // // descending order
        // Collections.sort(l, Collections.reverseOrder());
        // // Comparator-fnx logic
        // System.out.println(l);
        System.out.println(isAnagram("vcnjqdbuga", "acnjqdbugv"));
    }
}
