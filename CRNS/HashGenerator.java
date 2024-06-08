//HashGenerator
package CRNS;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class HashGenerator {

    public static String customHash(String inputString) {
        try {
            // Create a SHA-256 MessageDigest instance
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");

            // Convert the input string to bytes using UTF-8 encoding
            byte[] inputBytes = inputString.getBytes(StandardCharsets.UTF_8);

            // Compute the hash
            byte[] hashBytes = sha256.digest(inputBytes);

            // Convert the hash bytes to a hexadecimal representation
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter the input string: ");
        String inputString = scanner.nextLine();

        scanner.close();

        // Generate hash value
        String hashValue = customHash(inputString);
        System.out.println("Hash value of '" + inputString + "' is: " + hashValue);
    }
}
