package Strings;
import java.util.Scanner;

public class WordsInCamelCase {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int start = 0;
        int end = 0;
        for (int i=0; i<str.length(); i++) {
            if (i == str.length()-1) {
                if (Character.isUpperCase(str.charAt(i))) {
                    System.out.println(str.substring(start, end+1));
                    System.out.println(str.substring(i));
                } else {
                    System.out.println(str.substring(start));
                }
            } else {
                if (Character.isUpperCase(str.charAt(i))) {
                    if (i != 0) {
                        System.out.println(str.substring(start, end+1));
                    }
                    start = i;
                    end = i;
                } else {
                    end = i;
                }
            }
        }
    }
}
