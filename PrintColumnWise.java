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