package BitManipulation;
import java.util.Scanner;
public class BinaryToDecimal {

    public static void main(String []args) {
        int n = 0b100;
        int i = 0;
        int result = 0;
        if (n == 0) {
            System.out.println(result);
        } else {
            while (n > 0) {
                if ((n & 1) == 1) {
                    result += 1 << i;
                }
                n = n >> 1;
                i++;
            }
            System.out.println(result);
        }
    }
}