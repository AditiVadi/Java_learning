package CRNS;

// import java.util.*;

// public class Playfair {

//     public static char[][] prepareKey(String key) {
//         key = key.replaceAll("[^a-zA-Z]", "").toUpperCase().replace("J", "I");
//         Set<Character> set = new HashSet<>();
//         List<Character> list = new ArrayList<>();
//         for (char ch : key.toCharArray()) {
//             if (!set.contains(ch)) {
//                 list.add(ch);
//                 set.add(ch);
//             }
//         }
//         for (char ch = 'A'; ch <= 'Z'; ch++) {
//             if (ch != 'J' && !set.contains(ch)) {
//                 list.add(ch);
//             }
//         }
//         char[][] square = new char[5][5];
//         int index = 0;
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 square[i][j] = list.get(index++);
//             }
//         }
//         return square;
//     }

//     public static String decrypt(String cipherText, char[][] square) {
//         StringBuilder plainText = new StringBuilder();
//         for (int i = 0; i < cipherText.length(); i += 2) {
//             char first = cipherText.charAt(i);
//             char second = cipherText.charAt(i + 1);
//             int[] posFirst = findPosition(square, first);
//             int[] posSecond = findPosition(square, second);
//             if (posFirst[0] == posSecond[0]) {
//                 plainText.append(square[posFirst[0]][(posFirst[1] - 1 + 5) % 5]);
//                 plainText.append(square[posSecond[0]][(posSecond[1] - 1 + 5) % 5]);
//             } else if (posFirst[1] == posSecond[1]) {
//                 plainText.append(square[(posFirst[0] - 1 + 5) % 5][posFirst[1]]);
//                 plainText.append(square[(posSecond[0] - 1 + 5) % 5][posSecond[1]]);
//             } else {
//                 plainText.append(square[posFirst[0]][posSecond[1]]);
//                 plainText.append(square[posSecond[0]][posFirst[1]]);
//             }
//         }
//         return plainText.toString();
//     }

//     public static int[] findPosition(char[][] square, char ch) {
//         int[] position = new int[2];
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 if (square[i][j] == ch) {
//                     position[0] = i;
//                     position[1] = j;
//                     return position;
//                 }
//             }
//         }
//         return position;
//     }

//     public static void main(String[] args) {
//         String key = "pearlharbour";
//         String cipherText = "BWPNRSMUALAW";
//         char[][] square = prepareKey(key);
//         // String plainText = decrypt(cipherText, square);
//         // System.out.println("Decrypted message: " + plainText);
//         System.out.println("Decrypted message: " + " " + "LLLLLLLLLLLL");
//     }
// }

import java.util.*;

public class Playfair {

    public static Map<String, Integer> digraphFrequencyAnalysis(String text) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        text = text.replaceAll("[^a-zA-Z]", "").toUpperCase().replace("J", "I");
        for (int i = 0; i < text.length() - 1; i += 2) {
            String digraph = text.substring(i, i + 2);
            frequencyMap.put(digraph, frequencyMap.getOrDefault(digraph, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        String cipherText = "BWPNRSMUALAW";
        Map<String, Integer> digraphFrequency = digraphFrequencyAnalysis(cipherText);
        System.out.println("Digraph Frequency Analysis:");
        for (Map.Entry<String, Integer> entry : digraphFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
