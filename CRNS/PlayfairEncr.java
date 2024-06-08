//PlayfairEnceryption
package CRNS;

import java.util.Scanner;

public class PlayfairEncr {
    private static final int SIZE = 5;
    private static char[][] keySquare = new char[SIZE][SIZE];

    // Function to prepare the key square
    private static void prepareKeySquare(String key) {
        // Fill key in the key square
        String keyStr = key + "ABCDEFGHIKLMNOPQRSTUVWXYZ"; // ignoring 'J'
        keyStr = keyStr.toUpperCase().replaceAll("[^A-Z]", "");
        keyStr = keyStr.replace("J", "I");

        boolean[] used = new boolean[26];
        int i = 0, j = 0;

        for (char letter : keyStr.toCharArray()) {
            if (!used[letter - 'A']) {
                keySquare[i][j] = letter;
                used[letter - 'A'] = true;
                j++;
                if (j == SIZE) {
                    i++;
                    j = 0;
                }
            }
        }
    }

    // Function to find the position of a character in the key square
    private static void getPosition(char letter, int[] pos) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (keySquare[i][j] == letter) {
                    pos[0] = i;
                    pos[1] = j;
                    return;
                }
            }
        }
    }

    // Function to encrypt a digraph
    private static String encryptDigraph(char[] digraph) {
        StringBuilder result = new StringBuilder();

        int[] posFirst = new int[2];
        int[] posSecond = new int[2];
        getPosition(digraph[0], posFirst);
        getPosition(digraph[1], posSecond);

        if (posFirst[0] == posSecond[0]) { // Same row
            result.append(keySquare[posFirst[0]][(posFirst[1] + 1) % SIZE]);
            result.append(keySquare[posSecond[0]][(posSecond[1] + 1) % SIZE]);
        } else if (posFirst[1] == posSecond[1]) { // Same column
            result.append(keySquare[(posFirst[0] + 1) % SIZE][posFirst[1]]);
            result.append(keySquare[(posSecond[0] + 1) % SIZE][posSecond[1]]);
        } else { // Forming rectangle
            result.append(keySquare[posFirst[0]][posSecond[1]]);
            result.append(keySquare[posSecond[0]][posFirst[1]]);
        }

        return result.toString();
    }

    // Function to encrypt plaintext
    public static String encrypt(String plaintext, String key) {
        plaintext = plaintext.toUpperCase().replaceAll("[^A-Z]", "");
        StringBuilder result = new StringBuilder();

        prepareKeySquare(key);

        for (int i = 0; i < plaintext.length(); i += 2) {
            char[] digraph = new char[2];
            digraph[0] = plaintext.charAt(i);
            char x = 'X'; // Default filler character
            if (i + 1 < plaintext.length()) {
                digraph[1] = plaintext.charAt(i + 1);
                if (digraph[0] == digraph[1]) {
                    x = 'X'; // If same, insert filler
                    i--;
                }
            } else {
                digraph[1] = x;
            }
            result.append(encryptDigraph(digraph));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter plaintext: ");
        String plaintext = scanner.nextLine();
        System.out.print("Enter key: ");
        String key = scanner.nextLine();

        String encryptedText = encrypt(plaintext, key);
        System.out.println("Encrypted: " + encryptedText);

        scanner.close();
    }
}
