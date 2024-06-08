package CRNS;

import java.util.Scanner;

public class CaesarCipher {

    public static String encrypt(String message, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                char shiftedChar = (char) (((ch - 'A' + shift) % 26) + 'A');
                encryptedText.append(shiftedChar);
            } else {
                encryptedText.append(ch);
            }
        }

        return encryptedText.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the message: ");
        String message = scanner.nextLine();

        System.out.print("Enter the shift key: ");
        int shift = scanner.nextInt();

        shift = (shift % 26 + 26) % 26;

        String encryptedText = encrypt(message.toUpperCase(), shift);
        System.out.println("Encrypted text: " + encryptedText);

        scanner.close();
    }
}
