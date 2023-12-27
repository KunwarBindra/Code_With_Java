import java.util.Scanner;
public class Butterfly {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        // upper half
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=m; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j=m; j>=1; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            };
            System.out.println();
        };
        // lower half
        for (int i=m; i>=1; i--) {
            for (int j=1; j<=m; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j=m; j>=1; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            };
            System.out.println();
        };
    }
}