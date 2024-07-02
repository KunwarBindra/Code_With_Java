/*
    Problem Name: String - Max Frequency Character

    Take as input S, a string. Write a function that returns the character with maximum frequency. 
    Print the value returned.

    Input Format: String

    Constraints: A string of length between 1 to 1000.

    Output Format: Character

    Sample Input: aaabacb

    Sample Output: a

    Explanation: For the given input string, a appear 4 times. Hence, it is the most frequent character.
*/

package Strings;
// import java.util.Scanner;

// public class MostFrequentCharacter {
//     public static void main(String []args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String arr[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
//         int arrFrequency[] = new int[26];
//         String outputStr = "";
//         StringBuilder refStr = new StringBuilder();
//         for (int i=0; i<str.length(); i++) {
//             if (arrFrequency[str.charAt(i) - 'a'] == 0) {
//                 arrFrequency[str.charAt(i) - 'a'] += 1;
//                 refStr.append(str.charAt(i));
//             } else {
//                 arrFrequency[str.charAt(i) - 'a'] += 1;
//             }
//         }
//         int maxFrequency = 0;
//         int maxFrequencyIndex = 0;
//         for (int i=0; i<arrFrequency.length; i++) {
//             if (arrFrequency[i] > maxFrequency) {
//                 maxFrequency = arrFrequency[i];
//                 maxFrequencyIndex = i;
//             }
//         }
//         System.out.println("Max frequent character is: " + arr[maxFrequencyIndex]);
//         System.out.println("Occurred " + maxFrequency + " times");
//         for (int i=0; i<refStr.length(); i++) {
//             // System.out.print(refStr.charAt(i));
//             // System.out.print(arrFrequency[refStr.charAt(i) - 'a']);
//             outputStr += refStr.charAt(i);
//             outputStr += Integer.toString(arrFrequency[refStr.charAt(i) - 'a']);
//         }
//         System.out.println(outputStr);
//     }
// }

import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int arrFrequency[] = new int[256];
        String outputStr = "";
        StringBuilder refStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (arrFrequency[str.charAt(i)] == 0) {
                arrFrequency[str.charAt(i)] += 1;
                refStr.append(str.charAt(i));
            } else {
                arrFrequency[str.charAt(i)] += 1;
            }
        }
        int maxFrequency = 0;
        char maxFrequentChar = '\0';
        for (int i = 0; i < arrFrequency.length; i++) {
            if (arrFrequency[i] > maxFrequency) {
                maxFrequency = arrFrequency[i];
                maxFrequentChar = (char) (i);
            }
        }
        System.out.println("Max frequent character is: " + maxFrequentChar);
        System.out.println("Occurred " + maxFrequency + " times");
        /*
         * Problem Name: String Compression
         * 
         * Take as input S, a string.
         * Write a function that does basic string compression.
         * Print the value returned. E.g. for input “aaabbccds” print out a3b2c2d1s1.
         * 
         * Input Format: A single String S
         * 
         * Constraints: 1 < = length of String < = 1000
         * 
         * Output Format: The compressed String.
         * 
         * Sample Input: aaabbccds
         * 
         * Sample Output: a3b2c2d1s1
         * 
         * Explanation: In the given sample test case
         * 'a' is repeated 3 times consecutively,
         * 'b' is repeated twice,
         * 'c' is repeated twice and
         * 'd and 's' occurred only once.
         */
        for (int i = 0; i < refStr.length(); i++) {
            outputStr += refStr.charAt(i);
            outputStr += Integer.toString(arrFrequency[refStr.charAt(i)]);
        }
        System.out.println("Compressed string: " + outputStr);
    }
}
