package Recursion;
import java.util.Scanner;

public class MazeTotalPaths {
    public static int TotalPaths(int i, int j, int n, int m) {
        if (i == n-1 && j == m-1) {
            return 1;
        }
        if (i == n || j == m) {
            return 0;
        }
        int downwards = TotalPaths(i+1, j, n, m);
        int right = TotalPaths(i, j+1, n, m);
        return downwards + right;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(TotalPaths(0, 0, n, m));
    }
}
