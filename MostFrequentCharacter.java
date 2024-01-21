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
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int arrFrequency[] = new int[256];
        String outputStr = "";
        StringBuilder refStr = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            if (arrFrequency[str.charAt(i)] == 0) {
                arrFrequency[str.charAt(i)] += 1;
                refStr.append(str.charAt(i));
            } else {
                arrFrequency[str.charAt(i)] += 1;
            }
        }
        int maxFrequency = 0;
        char maxFrequentChar = '\0';
        for (int i=0; i<arrFrequency.length; i++) {
            if (arrFrequency[i] > maxFrequency) {
                maxFrequency = arrFrequency[i];
                maxFrequentChar = (char)(i);
            }
        }
        System.out.println("Max frequent character is: " + maxFrequentChar);
        System.out.println("Occurred " + maxFrequency + " times");
        for (int i=0; i<refStr.length(); i++) {
            outputStr += refStr.charAt(i);
            outputStr += Integer.toString(arrFrequency[refStr.charAt(i)]);
        }
        System.out.println("Compressed string: " + outputStr);
    }
}
