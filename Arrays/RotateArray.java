package Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int aux[] = new int[2*N];
        for (int i=0; i<arr.length; i++) {
            aux[i] = arr[i];
        }
        for (int i=0; i<arr.length; i++) {
            aux[N+i] = arr[i];
        }
        int j = 0;
        for (int i=N-k; i<N+N-k; i++) {
            arr[j++] = aux[i%N];
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
