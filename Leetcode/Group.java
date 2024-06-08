package Leetcode;

import java.util.Scanner;

public class Group {

    public static void ana(String str) {
        String s1 = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                System.out.println(str.charAt(i));
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        ana(s1);

    }

}
