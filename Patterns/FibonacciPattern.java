package Patterns;
import java.util.Scanner;

public class FibonacciPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1) {
                    System.out.print(a + " ");
                } else if (i == 2 && j == 1) {
                    System.out.print(b + " ");
                } else {
                    int c = a + b;
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                }
            }
            System.out.println();
        }
    }
}
