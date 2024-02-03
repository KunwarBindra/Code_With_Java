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