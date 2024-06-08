package ArrayList;

import java.util.ArrayList;

public class Water {
    public static int store(ArrayList<Integer> h) {
        int max = 0;
        // brute force- O(n^2)
        for (int i = 0; i < h.size(); i++) {
            for (int j = i + 1; j < h.size(); j++) {
                int ht = Math.min(h.get(i), h.get(j));
                int width = j - i;
                int cuttW = ht * width;
                max = Math.max(max, cuttW);
            }
        }
        return max;
    }

    // 2 Pointer Approach- O(n)
    public static int Pointer(ArrayList<Integer> h) {
        int max = 0;
        int lp = 0;
        int rp = h.size() - 1;
        while (lp < rp) {
            // calculate water area
            int ht = Math.min(h.get(lp), h.get(rp));
            int width = rp - lp;
            int currW = ht * width;
            max = Math.max(max, currW);

            // update ptr
            if (h.get(lp) < h.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>();
        h.add(1);
        h.add(8);
        h.add(6);
        h.add(2);
        h.add(5);
        h.add(4);
        h.add(8);
        h.add(3);
        h.add(7);
        System.out.println(store(h));
        System.out.println(Pointer(h));
    }
}
