package Recursion;
import java.util.Scanner;

public class StringSubsequences {
    public static void StringSubsequence(int i, String str, String newStr) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(i);
        // character wants to add to string
        StringSubsequence(i+1, str, newStr+currentChar);
        // character doesn't want to add to string
        StringSubsequence(i+1, str, newStr);
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr = "";
        StringSubsequence(0, str, newStr);
    }
}