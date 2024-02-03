package Recursion;
import java.util.Scanner;

public class MoveXToTheStringEnd {
    public static void MoveAllX(String str, StringBuilder otherElements, StringBuilder xElements, int i) {
        if (i == str.length()) {
            System.out.println(otherElements.append(xElements));
            return;
        }
        if (str.charAt(i) == 'x') {
            xElements.append("x");
            MoveAllX(str, otherElements, xElements, i+1);
        } else {
            char currentChar = str.charAt(i);
            otherElements.append(currentChar);
            MoveAllX(str, otherElements, xElements, i+1);
        }        
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder otherElements = new StringBuilder("");
        StringBuilder xElements = new StringBuilder("");
        MoveAllX(str, otherElements, xElements, 0);       
    }
}
