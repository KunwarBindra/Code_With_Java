package Arrays;
import java.util.Scanner;
public class MaximumSubarraySum {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr1 = new int[N];
        for(int i=0; i<N; i++) {
            arr1[i] = sc.nextInt();
        }
        // kadane's algorithm
        int currentSum = 0;
        int maximumSum = 0;
        for(int i=0; i<arr1.length; i++) {
            currentSum += arr1[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            if (currentSum > maximumSum) {
                maximumSum = currentSum;
            }
        }
        System.out.println(maximumSum);
    }
}
