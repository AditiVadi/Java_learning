//RSA with number
package CRNS;

import java.util.Scanner;

public class RSA1 {
    // Function to find gcd (Greatest Common Divisor)
    public static double gcd(double a, double b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input prime numbers p and q
        System.out.print("Enter the first prime number (p): ");
        double p = scanner.nextDouble();

        System.out.print("Enter the second prime number (q): ");
        double q = scanner.nextDouble();

        double n = p * q; // Compute n

        // Compute phi(n)
        double phi = (p - 1) * (q - 1);

        // Find e such that 1 < e < phi and gcd(e, phi) = 1
        double e = 2;
        while (e < phi) {
            if (gcd(e, phi) == 1)
                break;
            else
                e++;
        }

        // Input message to be encrypted
        System.out.print("Enter the message to be encrypted (a number less than n): ");
        double message = scanner.nextDouble();

        // Encryption: c = (message ^ e) % n
        double encrypted = Math.pow(message, e) % n;
        System.out.println("Encrypted ciphertext: " + encrypted);

        // Find d such that (d * e) % phi = 1
        double d = 1;
        while ((d * e) % phi != 1)
            d++;

        // Decryption: message = (ciphertext ^ d) % n
        double decrypted = Math.pow(encrypted, d) % n;
        System.out.println("Decrypted plaintext: " + decrypted);

        scanner.close();
    }
}
