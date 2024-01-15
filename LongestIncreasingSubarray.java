import java.util.Scanner;

public class LongestIncreasingSubarray {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int inc[] = new int[n];
        inc[0] = 1;
        for (int i=1; i<n; i++) {
            if (arr[i] > arr[i-1]) {
                inc[i] = inc[i-1] + 1;
            } else {
                inc[i] = 1;
            }
        }
        int currentLength = 0;
        int maxLength = 0;
        for (int i=0; i<n; i++) {
            currentLength = inc[i];
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        System.out.println("longest increasing subarray length is: " + maxLength);      
    }
}
