package CRNS;

import java.math.BigInteger;
import java.security.SecureRandom;

public class RSA {

    private BigInteger n, e, d;

    public RSA(int bitLength) {
        SecureRandom random = new SecureRandom();
        BigInteger p = BigInteger.probablePrime(bitLength / 2, random);
        BigInteger q = BigInteger.probablePrime(bitLength / 2, random);
        n = p.multiply(q);
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        e = BigInteger.valueOf(65537); // Commonly used public exponent
        d = e.modInverse(phi);
    }

    public BigInteger encrypt(BigInteger plaintext) {
        return plaintext.modPow(e, n);
    }

    public BigInteger decrypt(BigInteger ciphertext) {
        return ciphertext.modPow(d, n);
    }

    public static void main(String[] args) {
        RSA rsa = new RSA(1024); // Use a larger bit length for real-world applications

        // Get user input for message
        String message = "Aditi    Vadi"; // Replace with your desired input

        // Encryption by Alice
        BigInteger plaintext = new BigInteger(message.getBytes());
        BigInteger encryptedMessage = rsa.encrypt(plaintext);

        // MITM Attack: Intercepting the message and changing it
        BigInteger interceptedMessage = encryptedMessage;
        BigInteger modifiedMessage = interceptedMessage.add(BigInteger.valueOf(42)); // Altering the intercepted message

        // Decryption by Bob
        BigInteger decryptedMessage = rsa.decrypt(modifiedMessage);
        String originalMessage = new String(decryptedMessage.toByteArray());

        System.out.println("Original Message: " + message);
        System.out.println("Decrypted Message by Aditi after MITM Attack: " + originalMessage);
    }
}
