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