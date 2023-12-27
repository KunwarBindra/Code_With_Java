import java.util.Scanner;
public class DecimalToBinary {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder str = new StringBuilder("");
        if (n == 0) {
            System.out.println(n);
        } else {
            while (n > 0) {
                if (n % 2 == 0) {
                    str.insert(0, '0');
                    n = n/2;
                } else {
                    str.insert(0, '1');
                    n = n/2; // no need to use Math.floor, int will automatically truncate the decimal part
                }
            }
            int result = Integer.parseInt(str.toString());
            System.out.println(result);
        }
    }
}