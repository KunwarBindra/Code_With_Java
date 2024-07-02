/*
    Array - Wave print column wise
    
    Take as input a two-d array. Wave print it column-wise.
    
    Input Format:  Two integers M(row) and N(colomn) and further M * N integers(2-d array numbers).

    Constraints:  Both M and N are between 1 to 10.
    
    Output Format: All M * N integers seperated by commas with 'END' wriiten in the end(as shown in example).
    
    Sample Input:   4 4
                    11 12 13 14
                    21 22 23 24
                    31 32 33 34
                    41 42 43 44
    
    Sample Output: 11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 14, END

*/

package Arrays;
import java.util.Scanner;
public class PrintColumnWise {
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
        for(int i=0; i<N; i++){
            if (i%2 == 0) {
                for(int j=0;j<M; j++){
                    System.out.print(arr[j][i] + ", ");
                }
            } else {
                for(int j=M-1;j>=0; j--){
                    System.out.print(arr[j][i] + ", ");
                }
            }
        }
        System.out.print("END");
    }
}