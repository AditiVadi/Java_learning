package String;

import java.util.Scanner;

public class Palindrome {
    // O(n)
    public static boolean pali(String str) {
        int n = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // not palindrome
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "raceacar";

        System.out.println(pali(str));
    }
}
