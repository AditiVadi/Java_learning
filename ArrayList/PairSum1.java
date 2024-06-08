package ArrayList;

import java.util.ArrayList;

public class PairSum1 {
    // Brute Force
    public static boolean pair(ArrayList<Integer> l, int target) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i) + l.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // 2 Pointer Approach- O(n)
    public static boolean Pointer(ArrayList<Integer> l, int target) {
        int lp = 0, rp = l.size() - 1;
        while (lp != rp) {
            // case1
            if (l.get(rp) + l.get(lp) == target) {
                return true;
            } else if (l.get(rp) + l.get(lp) < target) {
                lp++;
            } else if (l.get(rp) + l.get(lp) > target) {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        int target = 5;
        System.out.println(pair(l, target));
        System.out.println(Pointer(l, target));

    }
}
