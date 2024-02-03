package Strings;
import java.util.Scanner;

public class UltraFastMaths {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        StringBuilder output = new StringBuilder();
        for (int i=0; i<str1.length(); i++) {
            Character str1Char = str1.charAt(i);
            Character str2Char = str2.charAt(i);
            int difference = Integer.parseInt(str1Char.toString()) - Integer.parseInt(str2Char.toString());
            if (difference != 0) {
                output.append('1');
            } else {
                output.append('0');
            }
        }
        System.out.println(output);
    }
}
