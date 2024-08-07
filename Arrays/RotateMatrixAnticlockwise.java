/*
    Problem Name: Rotate Image(N x N Array)

    Given a 2D array of size N x N. Rotate the array 90 degrees anti-clockwise.

    Input Format: First line contains a single integer N. Next N lines contain N space separated integers.

    Constraints: N < 1000

    Output Format: Print N lines with N space separated integers of the rotated array.

    Sample Input:   4
                    1 2 3 4
                    5 6 7 8
                    9 10 11 12
                    13 14 15 16


    Sample Output:  4 8 12 16 
                    3 7 11 15 
                    2 6 10 14 
                    1 5 9 13 

    Explanation: Rotate the array 90 degrees anticlockwise.
*/


package Arrays;
import java.util.Scanner;
public class RotateMatrixAnticlockwise {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // rows
        int N = sc.nextInt(); // columns
        int [][] arr = new int[M][N];
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=N-1; i>=0; i--) {
            for(int j=0; j<M; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}