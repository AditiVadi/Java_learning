package ArrayList;

import java.util.ArrayList;

public class Max {// O(n)
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(12);
        l.add(3);
        l.add(4);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < l.size(); i++) {
            // if (max < l.get(i)) {
            // max = l.get(i);
            // }
            max = Math.max(max, l.get(i));
        }
        System.out.println(max);
    }
}
