import java.util.*;

public class Star {
    public static void main(String[] args) {
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5 - i + 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Character
        // int n = 5;
        // char ch = 'A';
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(ch);
        // ch++;
        // }
        // System.out.println();
        // }

        // Half Piramid
        // for (int i = 1; i <= 5; i++) {

        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
