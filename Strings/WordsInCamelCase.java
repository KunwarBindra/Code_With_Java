/*
    Problem Name: Find all words in CamelCase string

    One of the important aspect of object oriented programming is readability of the code. 
    To enhance the readability of code, developers write function and variable names in Camel Case. 
    You are given a string, S, written in Camel Case. 
    Find all the words contained in it.

    Input Format: A single line contains the string.

    Constraints: |S|<=1000

    Output Format: Print words present in the string, in the order in which it appears in the string.

    Sample Input: IAmACompetitiveProgrammer

    Sample Output:  I
                    Am
                    A
                    Competitive
                    Programmer

    Explanation: There are 5 words in the string.
*/

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
