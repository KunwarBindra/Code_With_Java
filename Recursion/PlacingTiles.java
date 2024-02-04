package Recursion;
import java.util.Scanner;

public class PlacingTiles {
    public static int PlacingTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int vertically = PlacingTiles(n-m, m);
        int horizontally = PlacingTiles(n-1, m);
        return vertically + horizontally;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(PlacingTiles(n, m));
    }
}
