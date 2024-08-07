/*
    Problem Name: Maximum length Bitonic Subarray

    You are provided n numbers of array. 
    You need to find the maximum length of bitonic subarray. 
    A subarray A[i … j] is bitonic if there is a k with i <= k <= j such that A[i] <= A[i + 1] … <= A[k] >= A[k + 1] >= .. A[j – 1] > = A[j] i.e subarray is first increasing and then decreasing or entirely increasing or decreasing.

    Input Format: First line contains integer t which is number of test case. 
                  For each test case, it contains an integer n which is the size of array and next line contains n space separated integers.
    
    Constraints: 1<=t<=100 
                 1<=n<=1000000

    Output Format: Print the maximum length.

    Sample Input:   2
                    6
                    12 4 78 90 45 23
                    4
                    40 30 20 10

    Sample Output:  5
                    4

    Explanation: ForMaximum length = 4, 78, 90, 45, 23
*/
package Arrays;
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
