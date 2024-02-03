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