package CRNS;

import java.util.Arrays;
import java.util.Scanner;

class RailFence {

    public static String encryptRailFence(String text,
            int key) {

        char[][] rail = new char[key][text.length()];

        for (int i = 0; i < key; i++)
            Arrays.fill(rail[i], '\n');

        boolean dirDown = false;
        int row = 0, col = 0;

        for (int i = 0; i < text.length(); i++) {

            if (row == 0 || row == key - 1)
                dirDown = !dirDown;

            rail[row][col++] = text.charAt(i);

            if (dirDown)
                row++;
            else
                row--;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < key; i++)
            for (int j = 0; j < text.length(); j++)
                if (rail[i][j] != '\n')
                    result.append(rail[i][j]);

        return result.toString();
    }

    public static String decryptRailFence(String cipher, int key) {

        char[][] rail = new char[key][cipher.length()];

        for (int i = 0; i < key; i++)
            Arrays.fill(rail[i], '\n');

        boolean dirDown = true;

        int row = 0, col = 0;

        for (int i = 0; i < cipher.length(); i++) {

            if (row == 0)
                dirDown = true;
            if (row == key - 1)
                dirDown = false;

            rail[row][col++] = '*';

            if (dirDown)
                row++;
            else
                row--;
        }

        int index = 0;
        for (int i = 0; i < key; i++)
            for (int j = 0; j < cipher.length(); j++)
                if (rail[i][j] == '*'
                        && index < cipher.length())
                    rail[i][j] = cipher.charAt(index++);

        StringBuilder result = new StringBuilder();

        row = 0;
        col = 0;
        for (int i = 0; i < cipher.length(); i++) {

            if (row == 0)
                dirDown = true;
            if (row == key - 1)
                dirDown = false;

            if (rail[row][col] != '*')
                result.append(rail[row][col++]);

            if (dirDown)
                row++;
            else
                row--;
        }
        return result.toString();
    }

    public static void bruteForceAttack(String ciphertext) {
        int maxLength = ciphertext.length() / 2; // Maximum possible key value
        for (int key = 2; key <= maxLength; key++) {
            String decryptedMessage = decryptRailFence(ciphertext, key);
            System.out.println("Key: " + key + ", Decrypted Message: " + decryptedMessage);
        }
    }

    public static int findKey(String plaintext, String ciphertext) {
        int maxLength = ciphertext.length() / 2; // Maximum possible key value
        for (int key = 2; key <= maxLength; key++) {
            String encryptedMessage = encryptRailFence(plaintext, key);
            if (encryptedMessage.equals(ciphertext)) {
                return key;
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the key:");
        int k = sc.nextInt();
        System.out.println("enter String:");
        // System.out.println("test");
        String s = sc.next();

        System.out.println("Encrypted Message: ");
        System.out.println(encryptRailFence(s, k));
        // System.out.println(encryptRailFence("300 achieved glory at hot gate, unite
        // for Greece", 3));
        System.out.println("Decrystion message:");
        System.out.println(decryptRailFence("aidti", k));

        // // decryptRailFence(null, 0);

        // System.out.println("\nDecrypted Message: ");
        // System.out.println(decryptRailFence("3ae rtttuere0 civdgoya o ae nt o
        // ree0helhg,ifGc", 3));

        // bruteForceAttack("3ae rtttuere0 civdgoya o ae nt o ree0hel hg,ifGc");
        // System.out.println();

        // System.out.println("Known-Plaintext Attack:Using knowledge of a part of the
        // plaintext to deduce the key");
        // System.out.println(findKey("300 achieved glory at hot gate, unite for
        // Greece",
        // "3ae rtttuere0 civdgoya o ae nt o ree0hel hg,ifGc"));
    }
}
