/*
    Problem Name: Spiral Print Anticlockwise

    Take as input a 2-d array. Print the 2-D array in spiral form anti-clockwise.

    Input Format: Two integers M(row) and N(colomn) and further M * N integers(2-d array numbers).
    
    Constraints: Both M and N are between 1 to 10.

    Output Format: All M * N integers separated by commas with 'END' written in the end(as shown in example).

    Sample Input:   4 4
                    11 12 13 14
                    21 22 23 24
                    31 32 33 34
                    41 42 43 44

    Sample Output:  11, 21, 31, 41, 42, 43, 44, 34, 24, 14, 13, 12, 22, 32, 33, 23, END

    Explanation: For spiral level anti-clockwise traversal, 
                 Go for first column-> last row ->last column-> first row and 
                 then do the same traversal for the remaining matrix .
*/
package Arrays;
import java.util.Scanner;
public class SpiralOrderAnticlockwise {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // rows
        int N = sc.nextInt(); // columns
        int row_start = 0;
        int row_end = M-1;
        int col_start = 0;
        int col_end = N-1;
        int [][] arr = new int[M][N];
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        while ((row_start <= row_end) && (col_start <= col_end)) {
            for (int i=row_start; i<=row_end; i++) {
                System.out.print(arr[i][col_start] + ", ");
            }
            col_start++;
            for (int i=col_start; i<=col_end; i++) {
                System.out.print(arr[row_end][i] + ", ");
            }
            row_end--;
            for (int i=row_end; i>=row_start; i--) {
                System.out.print(arr[i][col_end] + ", ");
            }
            col_end--;
            for (int i=col_end; i>=col_start; i--) {
                System.out.print(arr[row_start][i] + ", ");
            }
            row_start++;
        }
        System.out.print("END");
    }
}