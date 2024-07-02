/*
    Problem Name: String - Difference in Ascii Codes

    Take as input S, a string. Write a program that inserts between each pair of 
    characters the difference between their ascii codes and print the ans.

    Input Format: String

    Constraints: Length of String should be between 2 to 1000.

    Output Format: String

    Sample Input:   acb

    Sample Output:  a2c-1b

    Explanation: For the sample case, the Ascii code of a=97 and c=99,
                 the difference between c and a is 2. Similarly,
                 the Ascii code of b=98 and c=99 and their difference is -1. 
                 So the ans is a2c-1b.
*/

package Strings;
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
