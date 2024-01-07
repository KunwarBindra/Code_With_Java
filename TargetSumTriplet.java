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