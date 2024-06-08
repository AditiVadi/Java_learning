package Codingninjas;

import java.util.ArrayList;

public class Asum {
    public static void sum(ArrayList<Integer> arr) {
        int asum = 0, dsum = 0;
        int j = 0;
        boolean c = false;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1) > arr.get(i)) {
                j = i - 1;
                break;
            }
            if (j == 0) {
                c = true;
            }
        }
        if (c == true) {
            j = arr.size();
        }
        System.out.println("j=" + j);
        for (int i = 0; i < j; i++) {
            asum += arr.get(i);
        }
        System.out.println("asum" + asum);
        for (int i = j; i < arr.size(); i++) {
            dsum += arr.get(i);
        }
        System.out.println("dsum" + dsum);
        if (dsum > asum) {
            System.out.println(1);
        } else if (asum > dsum) {
            System.out.println(0);
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 5, 3 };
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(3);
        // l.add(1);
        // l.add(3);
        // l.add(5);
        sum(l);
    }
}
