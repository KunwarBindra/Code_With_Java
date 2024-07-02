/*
    Problem Name: Find CSD Number

    Deepak and Gautam are having a discussion on a new type of number that they call Code Scoop Number or CSD Number. 

    They use following criteria to define a CSD Number.
    1.  0 and 1 are not a CSD number.
    2.  2,3,5,7,11,13,17,19,23,29 are CSD numbers.
    3.  Any number not divisible by the numbers in point 2( Given above) are also CSD numbers.
    
    Deepak said he loved CSD numbers. Hearing it, Gautam throws a challenge to him.
    Gautam will give Deepak a string of digits. 
    Deepak's task is to find the number of CSD numbers in the string.

    CSD number once detected should not be sub-string or super-string of any other CSD number.
    Ex- In 4991, both 499 and 991 are CSD numbers but you can choose either 499 or 991, not both.

    Further, the CSD number formed can only be a sub-string of the string.
    Ex - In 481, you can not take 41 as CSD number because 41 is not a sub-string of 481.

    As there can be multiple solutions, Gautam asks Deepak to find the maximum number of CSD numbers
    that can be formed from the given string. Now, help Deepak by solving Gautam's challenge.
        
    Input Format: First line contain size of the string.
                  Next line is A string of digits.

    Constraints: 1 <= Length of strings of digits <= 17

    Output Format: Maximum number of CSD numbers that can be formed.

    Sample Input: 5
                  81615

    Sample Output: 2

    Explanation: 61 and 5 are two CSD numbers.
*/

package Strings;
import java.util.Scanner;

public class FindCSDNumber {
    public static boolean isCSDNum(int num) {
        if (num == 2 || num == 3 || num == 5 || num == 7
                || num == 11 || num == 13 || num == 17 || num == 19 || num == 23
                || num == 29) {
            return true;
        }
        if (num != 0 && num != 1 && num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0
                && num % 11 != 0 && num % 13 != 0 && num % 17 != 0 && num % 19 != 0 && num % 23 != 0
                && num % 29 != 0) {
            return true;
        }
        return false;
    }

    public static boolean isValid(boolean visited[], int start, int end) {
        for (int i = start; i < end; i++) {
            if (visited[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numStr = sc.nextLine();
        boolean visited[] = new boolean[numStr.length()];
        String newStr = "";
        int csdCount = 0;
        for (int i = 0; i < numStr.length(); i++) {
            newStr = "";
            char currentChar = numStr.charAt(i);
            newStr += currentChar;
            int newNum = Integer.parseInt(newStr);
            if (isCSDNum(newNum) && isValid(visited, i, i+1)) {
                csdCount += 1;
                for (int k=i; k<i+1; k++) {
                    visited[k] = true;
                }
            }
            for (int j = i + 1; j < numStr.length(); j++) {
                currentChar = numStr.charAt(j);
                newStr += currentChar;
                newNum = Integer.parseInt(newStr);
                if (isCSDNum(newNum) && isValid(visited, i, j+1)) {
                    csdCount += 1;
                    for (int k=i; k<j+1; k++) {
                        visited[k] = true;
                    }
                }
            }
        }
        System.out.println(csdCount);
    }
}
