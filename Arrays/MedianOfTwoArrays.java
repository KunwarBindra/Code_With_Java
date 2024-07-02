/*
    Problem Name: Median of Sorted Arrays

    We are given two sorted arrays of same size n. 
    Find the median of an array formed after merging these two sorted arrays.
    
    Input Format: First line contains the input n. Second and Third line contains n space separated integers.

    Constraints: N < 1000

    Output Format: Print the median in a single line.

    Sample Input:   5
                    1 3 5 7 9
                    2 4 6 8 10

    Sample Output:  5

    Explanation:  Merged Array: [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10] So the median element is 5
*/
package Arrays;
import java.util.Scanner;
public class MedianOfTwoArrays {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        for (int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            arr2[i] = sc.nextInt();
        }
        int arr3Len = arr1.length + arr2.length;
        int [] arr3 = new int[arr3Len];
        for (int i=0; i<arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i=0; i<arr2.length; i++) {
            arr3[i+arr1.length] = arr2[i];
        }
        for (int i=0; i<arr3.length-1; i++) {
            for (int j=0; j<arr3.length-i-1; j++) {
                if (arr3[j] > arr3[j+1]) {
                    int temp = arr3[j];
                    arr3[j] = arr3[j+1];
                    arr3[j+1] = temp;
                }
            }
        }
        if (arr3.length % 2 == 0) {
            int pos = arr3.length/2;
            int median = (arr3[pos-1] + arr3[pos])/2;
            System.out.println(median);
        } else {
            int pos = (arr3.length+1)/2;
            int median = arr3[pos-1]/2;
            System.out.println(median);
        }
    }
}