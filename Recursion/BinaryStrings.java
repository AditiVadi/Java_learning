package Recursion;

public class BinaryStrings {
    public static void print(int n, int lastplace, String str) {

        // base
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // print(n - 1, 0, str + "0");
        // if (lastplace == 0) {
        // print(n - 1, 1, str + "1");

        // }
        print(n - 1, 1, str + "1");
        if (lastplace == 1) {
            print(n - 1, 0, str + "0");

        }

    }

    public static void main(String[] args) {
        print(3, 0, "");

    }
}
