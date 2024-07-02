/*
    Problem Name: Character Type

    Take the following as input:
    A character (ch) 
    Write a function that returns ‘U’, if it is uppercase; ‘L’ if it is lowercase and ‘I’ otherwise. 
    Print the value returned.

    Input Format: Character (ch)

    Constraints: No constraints

    Output Format: 'L' (if ch is lower-case) 'U' (if ch is upper-case) 'I' (otherwise)

    Sample Input: s

    Sample Output:  L

    Explanation: Anyone can Do it using Ascii codes. I dare you - "Try to not use ascii codes." ;).
*/

/*
    Problem Name: Lower Upper

    Print "lowercase" if user enters a character between 'a-z' , 
    Print "UPPERCASE" is character lies between 'A-Z' and 
    print "Invalid" for all other characters like $,.^# etc.

    Input Format: Single Character

    Constraints: No constraints

    Output Format: lowercase UPPERCASE Invalid

    Sample Input: $

    Sample Output:  Invalid

    Explanation: NA
*/

package Strings;
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
