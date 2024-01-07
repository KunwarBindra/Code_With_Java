// import java.util.Scanner;
// public class TargetSumPair {
//     public static void main(String []args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int [] arr = new int[N];
//         for(int i=0; i<N; i++) {
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0; i<N; i++) {
//             for(int j=0; j<N; j++) {
//                 if ((arr[i] + arr[j]) == 5) {
//                     if (arr[i] > arr[j]) {
//                         System.out.print(arr[j] + " and " + arr[i]);
//                     } else {
//                         System.out.print(arr[i] + " and " + arr[j]);
//                     }
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;
// public class TargetSumPair {
//     public static void main(String []args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int [] arr = new int[N];
//         int target = sc.nextInt();
//         for(int i=0; i<N; i++) {
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0; i<N; i++) {
//             for(int j=i+1; j<N; j++) { // starting j from i+1 to check only for unique pairs
//                 if (arr[i] + arr[j] == target) {
//                     if (arr[i] > arr[j]) {
//                         System.out.println(arr[j] + " and " + arr[i]);
//                     } else {
//                         System.out.println(arr[i] + " and " + arr[j]);
//                     }
//                 }
//             }
//         }
//     }
// }

import java.util.Scanner;
public class TargetSumPair {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        int target = sc.nextInt();
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        // Bubble sort
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // target sum pair using 2 pointer approach
        int left = 0;
        int right = arr.length-1;
        while (left<right) {
            if (arr[left] + arr[right] == target) {
                System.out.println(arr[left] + " and " + arr[right]);
                left++;
                right--;
            } 
            if (arr[left] + arr[right] > target) {
                right--;
            }
            if (arr[left] + arr[right] < target) {
                left++;
            }
        }
    }
}