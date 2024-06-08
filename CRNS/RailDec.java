//Railfance Decryption

package CRNS;

import java.util.Scanner;

public class RailDec {
    public static String decrypt(String cipherText, int rails) {
        StringBuilder[] fence = new StringBuilder[rails];
        for (int i = 0; i < rails; i++) {
            fence[i] = new StringBuilder();
        }

        int[] railSizes = new int[rails];
        int rail = 0;
        boolean down = true;

        // Calculate rail sizes
        for (int i = 0; i < cipherText.length(); i++) {
            railSizes[rail]++;
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

        // Decrypt
        int textIndex = 0;
        for (int i = 0; i < rails; i++) {
            for (int j = 0; j < railSizes[i]; j++) {
                fence[i].append(cipherText.charAt(textIndex));
                textIndex++;
            }
        }

        StringBuilder result = new StringBuilder();
        rail = 0;
        down = true;

        // Read the fence
        for (int i = 0; i < cipherText.length(); i++) {
            result.append(fence[rail].charAt(0));
            fence[rail].deleteCharAt(0);
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

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to decrypt: ");
        String text = scanner.nextLine();

        System.out.print("Enter number of rails: ");
        int rails = scanner.nextInt();

        String decryptedText = decrypt(text, rails);
        System.out.println("Decrypted: " + decryptedText);

        scanner.close();
    }
}
