/*
    Problem Name: Sum of Two Arrays

    Take as input N, the size of array. 
    Take N more inputs and store that in an array. 
    Take as input M, the size of second array and take M more inputs and store that in second array. 
    Write a function that returns the sum of two arrays. 
    Print the value returned.
    
    Constraints: Length of Array should be between 1 and 1000.

    Sample Input:   4
                    1 0 2 9
                    5
                    3 4 5 6 7


    Sample Output:  3, 5, 5, 9, 6, END

    Explanation: Sum of [1, 0, 2, 9] and [3, 4, 5, 6, 7] is [3, 5, 5, 9, 6] and 
                 the first digit represents carry over , if any (0 here ) .
*/
package Arrays;
import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr1 = new int[N];
        for(int i=0; i<N; i++) {
            arr1[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int [] arr2 = new int[M];
        for(int i=0; i<M; i++) {
            arr2[i] = sc.nextInt();
        }
        int arrDifference = 0;
        int carry = 0;
        int remainder = 0;
        int sum = 0;
        if (arr2.length > arr1.length) {
            arrDifference = arr2.length - arr1.length;
            int resultArrSize = arr2.length;
            int [] resultArr = new int[resultArrSize];
            int [] arrWithCarry = new int[resultArrSize + 1];
            Boolean carryExists = false;
            for(int i=arr2.length-1; i>=0; i--) {
                if ((i-arrDifference) < 0) {
                    sum = arr2[i] + carry;
                } else {
                    sum = arr1[i-arrDifference] + arr2[i] + carry;
                }
                remainder = sum%10;
                carry = sum/10;
                resultArr[i] = remainder;
                if (i == 0 && carry > 0) {
                    carryExists = true;
                } 
            }
            if (carryExists) {
                for(int j=resultArr.length-1; j>=0; j--) {
                    arrWithCarry[j+1] = resultArr[j];
                }
                arrWithCarry[0] = carry;
                for(int i=0; i<arrWithCarry.length; i++) {
                    System.out.print(arrWithCarry[i] + " ");
                }
            } else {
                for(int i=0; i<resultArr.length; i++) {
                    System.out.print(resultArr[i] + " ");
                }
            }
        } else if (arr1.length > arr2.length) {
            arrDifference = arr1.length - arr2.length;
            int resultArrSize = arr1.length;
            int [] resultArr = new int[resultArrSize];
            int [] arrWithCarry = new int[resultArrSize + 1];
            Boolean carryExists = false;
            for(int i=arr1.length-1; i>=0; i--) {
                if ((i-arrDifference) < 0) {
                    sum = arr1[i] + carry;
                } else {
                    sum = arr1[i] + arr2[i-arrDifference] + carry;
                }
                remainder = sum%10;
                carry = sum/10;
                resultArr[i] = remainder;
                if (i == 0 && carry > 0) {
                    carryExists = true;
                } 
            }
            if (carryExists) {
                for(int j=resultArr.length-1; j>=0; j--) {
                    arrWithCarry[j+1] = resultArr[j];
                }
                arrWithCarry[0] = carry;
                for(int i=0; i<arrWithCarry.length; i++) {
                    System.out.print(arrWithCarry[i] + " ");
                }
            } else {
                for(int i=0; i<resultArr.length; i++) {
                    System.out.print(resultArr[i] + " ");
                }
            }
        } else {
            int resultArrSize = N;
            int [] resultArr = new int[resultArrSize];
            int [] arrWithCarry = new int[resultArrSize + 1];
            Boolean carryExists = false;
            for(int i=N-1; i>=0; i--) {
                sum = arr1[i] + arr2[i] + carry;
                remainder = sum%10;
                carry = sum/10;
                resultArr[i] = remainder;
                if (i == 0 && carry > 0) {
                    carryExists = true;
                } 
            }
            if (carryExists) {
                for(int j=resultArr.length-1; j>=0; j--) {
                    arrWithCarry[j+1] = resultArr[j];
                }
                arrWithCarry[0] = carry;
                for(int i=0; i<arrWithCarry.length; i++) {
                    System.out.print(arrWithCarry[i] + " ");
                }
            } else {
                for(int i=0; i<resultArr.length; i++) {
                    System.out.print(resultArr[i] + " ");
                }
            }
        }
    }
}
