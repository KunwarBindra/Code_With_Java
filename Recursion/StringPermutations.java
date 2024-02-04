package Recursion;
import java.util.Scanner;

public class StringPermutations {
    public static void Permutations(String inputStr, String newStr) {
        if (inputStr.length() == 0) {
            System.out.println(newStr);
            return;
        }
        for (int i=0; i<inputStr.length(); i++) {
            char current = inputStr.charAt(i);
            String newSubStr = inputStr.substring(0, i) + inputStr.substring(i+1);
            Permutations(newSubStr, newStr+current);
        }
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr = "";
        Permutations(str, newStr);
    }
}