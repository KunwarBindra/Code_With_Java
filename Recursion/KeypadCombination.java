package Recursion;
import java.util.Scanner;

// public class KeypadCombination {
//     public static void Combination(int i, int j, String firstString, String secondString, String newStr) {
//         if (i < firstString.length() && j == secondString.length() ) {
//             i++;
//             j=0;
//         }
//         if (i == firstString.length()) {
//             return;
//         }
//         newStr = "";
//         char firstCurrentChar = firstString.charAt(i);
//         newStr += firstCurrentChar;
//         char secCurrentChar = secondString.charAt(j);
//         newStr += secCurrentChar;
//         System.out.println(newStr);

//         Combination(i, j+1, firstString, secondString, newStr);
//     }
//     public static void main(String []args) {
//         Scanner sc = new Scanner(System.in);
//         int firstNum = sc.nextInt();
//         int secondNum = sc.nextInt();
//         String arr[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
//         String newStr = "";
//         Combination(0, 0, arr[firstNum], arr[secondNum], newStr);
//     }
// }

public class KeypadCombination {
    public static String arr[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void Combination(int idx, String inputStr, String newStr) {
        if (idx == inputStr.length()) {
            System.out.println(newStr);
            return;
        }
        String mapping = arr[inputStr.charAt(idx) - '0'];
        for (int i=0; i<mapping.length(); i++) {
            Combination(idx+1, inputStr, newStr+mapping.charAt(i));
        }
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        String newStr = "";
        Combination(0, inputStr, newStr);
    }
}
