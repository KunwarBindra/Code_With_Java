import java.util.Scanner;

public class IsArrayPalindrome {
    public static boolean CheckPalindrome(int left, int right, int arr[]) {
        if (left >= right) {
            return true;
        }
        if (arr[left] == arr[right]) {
            return CheckPalindrome(left+1, right-1, arr);
        } else {
            return false;
        }
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = arr.length-1;
        System.out.println(CheckPalindrome(left, right, arr));
    }
}
