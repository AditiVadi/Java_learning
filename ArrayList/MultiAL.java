package ArrayList;

import java.util.ArrayList;

public class MultiAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);

        }
        mainlist.add(list);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);
        // nested loop
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> curr = mainlist.get(i);
            for (int j = 0; j < curr.size(); j++) {
                System.out.print(curr.get(j) + " ");
            }
            System.out.println();
        }

        // list.add(1);
        // list.add(2);
        // mainlist.add(list);

        // list2.add(3);
        // list2.add(4);
        // mainlist.add(list2);
        // System.out.println(mainlist);

        // for (int i = 0; i < mainlist.size(); i++) {
        // ArrayList<Integer> curr = mainlist.get(i);
        // for (int j = 0; j < curr.size(); j++) {
        // System.out.print(curr.get(j) + " ");
        // }
        // System.out.println();
        // }
    }
}
