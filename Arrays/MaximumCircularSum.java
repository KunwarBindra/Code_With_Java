/*
    Problem Name: Maximum Circular Sum

    You are provided n numbers (both +ve and -ve). Numbers are arranged in a circular form. 
    You need to find the maximum sum of consecutive numbers.

    Input Format: First line contains integer t which is number of test case.
                  For each test case, it contains an integer n which is the size of array and next line contains n space separated integers denoting the elements of the array.

    Constraints: 1<=t<=100
                 1<=n<=1000
                 |Ai| <= 10000

    Output Format: Print the maximum circular sum for each testcase in a new line.

    Sample Input:   1
                    7
                    8 -8 9 -9 10 -11 12

    Sample Output:  22

    Explanation: Maximum Circular Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)
*/
package Arrays;
import java.util.Scanner;
public class MaximumCircularSum {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr1 = new int[N];
        for(int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        // below approach takes extra space
        // int [] arr2 = new int[2*N];
        // for(int i=0; i<N; i++) {
        //     arr2[i] = arr2[N+i] = arr1[i];
        // }
        // kadane's algorithm
        int currentSum = 0;
        int maximumSum = 0;
        // we will iterate arr1 for space optimization using mod operator, simce we are starting i from N-1 (last element), we will go till N + N-1 (second last element of arr1).
        for(int i = N-1; i < (N+N-1); i++) {
            currentSum += arr1[i % N]; // mod returns remainder, for example, N is 7, 6 % 7 = 6, so last element will print, then 7 % 7 = 0, so first element will print and so on..
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