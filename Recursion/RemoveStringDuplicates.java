package Recursion;
import java.util.Scanner;

public class RemoveStringDuplicates {
    // public static int map[] = new int[26];
    public static void RemoveDuplicates(String str, int i, StringBuilder newString, boolean map[]) {
        if (i == str.length()) {
            System.out.println(newString);
            return;
        }
        Character currentChar = str.charAt(i);
        if (map[currentChar - 'a']) {
            RemoveDuplicates(str, i+1, newString, map);
        } else {
            newString.append(currentChar.toString());
            map[currentChar - 'a'] = true;
            RemoveDuplicates(str, i+1, newString, map);
        }
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder newString = new StringBuilder("");
        boolean map[] = new boolean[26];
        RemoveDuplicates(str, 0, newString, map);       
    }
}
