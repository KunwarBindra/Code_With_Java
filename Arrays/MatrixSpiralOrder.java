package Arrays;
import java.util.Scanner;
public class MatrixSpiralOrder {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] matrix = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int row_start = 0;
        int row_end = n-1;
        int col_start = 0;
        int col_end = m-1;
        while (row_start <= row_end && col_start <=col_end) {
            for (int i=col_start; i<=col_end; i++) {
                System.out.print(matrix[row_start][i] + " ");
            }
            row_start++;
            for (int i=row_start; i<=row_end; i++) {
                System.out.print(matrix[i][col_end] + " ");
            }
            col_end--;
            for (int i=col_end; i>=col_start; i--) {
                System.out.print(matrix[row_end][i] + " ");
            }
            row_end--;
            for (int i=row_end; i>=row_start; i--) {
                System.out.print(matrix[i][col_start] + " ");
            }
            col_start++;
        }
    }
}