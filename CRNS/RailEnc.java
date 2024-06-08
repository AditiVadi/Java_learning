//Railfance Encription
package CRNS;

import java.util.Scanner;

public class RailEnc {
    public static String encrypt(String text, int rails) {
        StringBuilder[] fence = new StringBuilder[rails];
        for (int i = 0; i < rails; i++) {
            fence[i] = new StringBuilder();
        }

        int rail = 0;
        boolean down = true;

        for (int i = 0; i < text.length(); i++) {
            fence[rail].append(text.charAt(i));
            if (rail == 0) {
                down = true;
            } else if (rail == rails - 1) {
                down = false;
            }
            if (down) {
                rail++;
            } else {
                rail--;
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : fence) {
            result.append(sb);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to encrypt: ");
        String text = scanner.nextLine();

        System.out.print("Enter number of rails: ");
        int rails = scanner.nextInt();

        String encryptedText = encrypt(text, rails);
        System.out.println("Encrypted: " + encryptedText);

        scanner.close();
    }
}
