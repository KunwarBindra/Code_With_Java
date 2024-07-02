/*
    Problem Name: Chewbacca and Number

    Luke Skywalker gave Chewbacca an integer number x. 
    Chewbacca isn't good at numbers but he loves inverting digits in them. 
    Inverting digit t means replacing it with digit 9 - t.

    Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. 
    The decimal representation of the final number shouldn't start with a zero.
    
    Input Format: The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that Luke Skywalker gave to Chewbacca.

    Constraints: x <= 100000000000000000

    Output Format: Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't contain leading zeroes.

    Sample Input:   4545

    Sample Output:  4444

    Explanation: There are many numbers form after inverting the digit. For minimum number, check if inverting digit is less than or greater than the original digit. If it is less, then invert it otherwise leave it.
*/
package Arrays;
import java.util.Scanner;
public class ChewbaccaAndNumber {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int remainder = 0;
        int invertDigit = 0;
        int ans = 0;
        int multiplier = 1;

        while (N>0) {
            remainder = N%10;
            if (remainder >= 5) {
                if (remainder == 9 && N/10 == 0) {
                    invertDigit = 9;
                } else {
                    invertDigit = 9-remainder;
                }
            } else {
                invertDigit = remainder;
            }
            ans += invertDigit * multiplier;
            N = N/10;
            multiplier = multiplier * 10;
        }
        System.out.println(ans);
    }
}