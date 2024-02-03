package Strings;
import java.util.Scanner;

public class FirstAndLastOccurrence {
    public static int first = -1;
    public static int last = -1;
    public static void GetOccurrence(int i, String str, char current) {
        if (i == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (first == -1 && str.charAt(i) == current) {
            first = i;
            last = i;
        } else if (str.charAt(i) == current) {
            last = i;
        }
        GetOccurrence(i+1, str, current);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char search = sc.next().charAt(0);
        GetOccurrence(0, str, search);
    }
}
