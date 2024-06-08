package Recursion;

public class FristOccurence {
    public static int frist(int n[], int key, int i) {
        if (i == n.length) {
            return -1;
        }
        if (n[i] == key) {
            return i;
        }
        return frist(n, key, i + 1);
    }

    public static int last(int n[], int key, int i) {
        if (i == n.length) {
            return -1;
        }
        int isfound = last(n, key, i + 1);
        // if(isfound != -1){
        // return isfound;
        // }
        // if(n[i]==key){
        // return i;
        // }

        if (isfound == -1 && n[i] == key) {
            return i;
        }
        return isfound;
    }

    public static void main(String[] args) {
        int n[] = { 6, 4, 5, 8, 5, 5, 5 };
        System.out.println(frist(n, 5, 0));
        System.out.println(last(n, 5, 0));
    }
}
