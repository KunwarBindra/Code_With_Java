package Patterns;
import java.util.Scanner;
public class FloydTriangle {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int temp = 0;
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=i; j++) {
                temp = temp + 1;
                System.out.print(temp+" ");
            };
            System.out.println();
        };
    }
}