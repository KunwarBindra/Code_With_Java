package Arrays;
import java.util.Scanner;
public class MatrixSearch {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // rows
        int N = sc.nextInt(); // columns
        Boolean searchFound = false;
        int x = sc.nextInt();
        int [][] arr = new int[M][N];
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++) {
                if (arr[i][j] == x) {
                    searchFound = true;
                }
            }
        }
        System.out.println(searchFound ? '1' : '0');
    }
}