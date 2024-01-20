import java.util.Scanner;

public class ASCIICodeDifference {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        StringBuilder outputStr = new StringBuilder(inputStr);
        // System.out.print(inputStr.charAt(0));
        for (int i=1; i<inputStr.length(); i++) {
            int asciiChar1 = inputStr.charAt(i);
            int asciiChar2 = inputStr.charAt(i-1);
            int difference = asciiChar1 - asciiChar2;
            // System.out.print(difference);
            // System.out.print(inputStr.charAt(i));
            Character index = inputStr.charAt(i);
            outputStr.insert(outputStr.indexOf(index.toString()), Integer.toString(difference));
        }
        System.out.println(outputStr);
    }
}
