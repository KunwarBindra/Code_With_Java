import java.util.Scanner;

public class PersonAndMagicalPark {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // rows
        int M = sc.nextInt(); // columns
        int K = sc.nextInt();
        int S = sc.nextInt();
        boolean isGameFinished = false;
        char [][] arr = new char[N][M];
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }
        for(int i=0; i<N; i++){
            if (S >= K) {
                for(int j=0; j<M; j++) {
                    if (S >= K) {
                        if (arr[i][j] == '.') {
                            S = S-2;
                        }
                    } else {
                        break;
                    }
                    if (S >= K) {
                        if (arr[i][j] == '*') {
                            S = S+5;
                        }
                    } else {
                        break;
                    }
                    if (arr[i][j] == '#') {
                        break;
                    }
                    if (j != M-1) {
                        S = S-1;
                    }
                }
                if (i == N-1) {
                    isGameFinished = true;
                }
            } else {
                break;
            }
        }
        if (isGameFinished) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(S);
    }
}
