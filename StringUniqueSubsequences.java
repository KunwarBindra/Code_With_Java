import java.util.HashSet;
import java.util.Scanner;

public class StringUniqueSubsequences {
    public static void StringSubsequence(int i, String str, String newStr, HashSet<String> set) {
        if (i == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currentChar = str.charAt(i);
        // character wants to add to string
        StringSubsequence(i+1, str, newStr+currentChar, set);
        // character doesn't want to add to string
        StringSubsequence(i+1, str, newStr, set);
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr = "";
        HashSet<String> set = new HashSet<>();
        StringSubsequence(0, str, newStr, set);
    }
}
