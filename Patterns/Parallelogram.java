package Patterns;
import java.util.Scanner;
public class Parallelogram {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        // upper half
        for (int i=1; i<=m; i++) {
            for (int j=m; j>=1; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            };
            for (int j=4; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        };
    }
}