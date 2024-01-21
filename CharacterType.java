import java.util.Scanner;

public class CharacterType {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UPPERCASE");
        } else if (ch >= 'a' && ch <= 'z')  {
            System.out.println("lowercase");
        } else {
            System.out.println("Invalid");
        }
    }
}
