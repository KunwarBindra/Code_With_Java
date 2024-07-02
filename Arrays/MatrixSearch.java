/*
    Problem Name: Matrix Search

    Given an n x m matrix, where every row and column is sorted in increasing order, and a number x . 
    Find if element x is present in the matrix or not.
    
    Input Format: First line consists of two space separated integers N and M, 
                  denoting the number of element in a row and column respectively. 
                  Second line of each test case consists of N*M space separated integers 
                  denoting the elements in the matrix in row major order. 
                  Third line of each test case contains a single integer x, the element to be searched.

    Constraints: 1 <= N, 
                 M <= 30 
                 0 <= A[i] <= 100

    Output Format: Print 1 if the element is present in the matrix, else 0.

    Sample Input:   3 3
                    3 30 38
                    44 52 54
                    57 60 69
                    62


    Sample Output:  0

    Explanation: Search the element in the sorted matrix. 
                 If the element is present print 1 otherwise print 0. 
                 In the sample input,in first case 62 is not present in the matrix so 0 is printed. 
                 Similarly, for second case 55 is present in the matrix so 1 is printed.
*/

package Arrays;
import java.util.Scanner;
public class MatrixSearch {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // rows
        int N = sc.nextInt(); // columns
        Boolean searchFound = false;
        int x = sc.nextInt();
        int [][] arr = new int[M][N];
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++) {
                if (arr[i][j] == x) {
                    searchFound = true;
                }
            }
        }
        System.out.println(searchFound ? '1' : '0');
    }
}