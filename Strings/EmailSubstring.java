package Strings;
import java.util.Scanner;
public class EmailSubstring {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        int index = 0;
        for (int i=0; i<email.length(); i++) {
            if (email.charAt(i) == '@') { // single quotes for char and double quotes for string
                index = i;
            }
        }
        String username = email.substring(0,index);
        System.out.print(username);
    }
}