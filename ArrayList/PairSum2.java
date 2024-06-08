package ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    // Sorted & Roteted AraayList
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

    // 2 Pointer Approach - O(n)
    public static boolean Pointer(ArrayList<Integer> l, int target) {
        int bp = -1;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) > l.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1, rp = bp;
        int n = l.size();
        while (lp != rp) {
            // case1
            if (l.get(rp) + l.get(lp) == target) {
                return true;
            } else if (l.get(rp) + l.get(lp) < target) {
                lp = (lp + 1) % n;
            } else if (l.get(rp) + l.get(lp) > target) {
                rp = (n + rp - 1) % n;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(11);
        l.add(15);
        l.add(6);
        l.add(8);
        l.add(9);
        l.add(10);
        int target = 16;
        System.out.println(pair(l, target));
        System.out.println(Pointer(l, target));
    }
}
