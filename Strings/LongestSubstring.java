package Strings;
// O(n^2) method using nested loops
// import java.util.Scanner;
// public class LongestSubstring {

//     public static void main(String []args) {
//         Scanner sc = new Scanner(System.in);
//         String inputStr = sc.next();
//         StringBuilder testStr = new StringBuilder("");
//         StringBuilder resultStr = new StringBuilder("");
//         int testStrLen = 0;
//         int resultStrLen = 0;
//         for (int i=0; i<inputStr.length(); i++) {
//             for (int j=0; j<testStr.length(); j++) {
//                 if (inputStr.charAt(i) == testStr.charAt(j)) {
//                     testStr.delete(0, j+1);
//                     break;
//                 }
//             }
//             testStr.append(inputStr.charAt(i));
//             testStrLen = testStr.length();
//             if (testStrLen > resultStrLen) {
//                 resultStr.setLength(0);
//                 resultStr.append(testStr);
//                 resultStrLen = testStrLen;
//             }
//         }
//         System.out.println(resultStrLen);
//         System.out.println(resultStr);
//     }
// }

// O(n) method using single loop and indexOf method
import java.util.Scanner;
public class LongestSubstring {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        StringBuilder testStr = new StringBuilder("");
        StringBuilder resultStr = new StringBuilder("");
        int testStrLen = 0;
        int resultStrLen = 0;
        for (int i=0; i<inputStr.length(); i++) {
            Character currentChar = inputStr.charAt(i);
            if (testStr.indexOf(currentChar.toString()) != -1) {
                int index = testStr.indexOf(currentChar.toString());
                testStr.delete(0, index+1);
            }
            testStr.append(inputStr.charAt(i));
            testStrLen = testStr.length();
            if (testStrLen > resultStrLen) {
                resultStr.setLength(0);
                resultStr.append(testStr);
                resultStrLen = testStrLen;
            }
        }
        System.out.println(resultStrLen);
        System.out.println(resultStr);
    }
}