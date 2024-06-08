package String;

import java.util.Scanner;

public class Strings {
    public static void print(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 1) {
                sum += str.charAt(i);
            }

        }
        System.out.println(sum);

    }

    public static String Sub(String str, int si, int ei) {
        String sub = "";
        for (int i = si; i < ei; i++) {
            sub += str.charAt(i);
        }
        return sub;
    }

    public static void main(String[] args) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str1 = new String("xyz");
        // print(str);

        // String are Immutable-change na thai
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        // String name = "aditi vadi";
        // System.out.println(name.length());

        // Concatenation
        // String s1 = "1111111 ";
        // String s2 = "aditi";
        // String s3 = s1 + s2;
        // System.out.println(s3);
        // print(s3);

        // ek ek char
        // System.out.println(s3.charAt(0));

        // Substring
        String str = "Helloooooooooo";
        System.out.println(str.substring(0, 5));

        System.out.println(Sub(str, 0, 7));

    }
}
