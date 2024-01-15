import java.util.Scanner;

public class BitonicSubarrayLength {
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
        int dec[] = new int[n];
        dec[n-1] = 1;
        for (int i=n-2; i>=0; i--) {
            if (arr[i] > arr[i+1]) {
                dec[i] = dec[i+1] + 1;
            } else {
                dec[i] = 1;
            }
        }
        int currentLength = 0;
        int maxLength = 0;
        for (int i=0; i<n; i++) {
            currentLength = inc[i] + dec[i] - 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        System.out.println("Max bitonic subarray length is: " + maxLength);      
    }
}
