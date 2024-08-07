/*
    Array - Target Sum Triplets

    Take as input N, the size of array. 
    Take N more inputs and store that in an array. 
    Take as input “target”, a number. 
    Write a function which prints all triplets of numbers which sum to target.
    
    Input Format:  First line contains input N.
    Next line contains N space separated integers denoting the elements of the array.
    The third line contains a single integer T denoting the target element.

    Constraints:  Length of Array should be between 1 and 1000.
    
    Output Format: Print all the triplet present in the array in a new line each. 
    The triplets must be printed as A, B and C where A,B and C are the elements of the triplet ( A<=B<=C) and all triplets must be printed in sorted order. 
    Print only unique triplets.
    
    Sample Input:   9
                    5 7 9 1 2 4 6 8 3
                    10
    
    Sample Output:  1, 2 and 7
                    1, 3 and 6
                    1, 4 and 5
                    2, 3 and 5

    Explanation: Array = {5, 7, 9, 1, 2, 4, 6 ,8 ,3}. Target number = 10. 
                 Find any three number in the given array which sum to target number.

*/

package Arrays;
// not optimised method
// import java.util.Scanner;
// public class TargetSumTriplet {
//     public static void main(String []args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int [] arr = new int[N];
//         for(int i=0; i<N; i++) {
//             arr[i] = sc.nextInt();
//         }
//         for(int i=1; i<arr.length; i++) {
//             int current = arr[i];
//             int j = i-1;
//             while (j>=0 && arr[j] > current) {
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = current;
//         }
//         for(int i=0; i<arr.length; i++) {
//             for (int j=i+1; j<arr.length; j++) {
//                 for (int k=j+1; k<arr.length; k++) {
//                     if (arr[i] + arr[j] + arr[k] == 10) {
//                         System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
//                     }
//                 }
//             }
//         }
//     }
// }

import java.util.Scanner;
public class TargetSumTriplet {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        // Selection sort
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        // 2 pointer approach
        for(int i=0; i<arr.length-2; i++){
            int left = i+1;
            int right = arr.length-1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    System.out.println(arr[i] + ", " + arr[left] + " and " + arr[right]);
                    left++;
                    right--;
                }
                if (sum > target) {
                    right--;
                }
                if (sum < target) {
                    left++;
                }
            }
        }
    }
}