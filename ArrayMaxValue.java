import java.util.Scanner;
public class ArrayMaxValue {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        int max_value = Integer.MIN_VALUE;
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > max_value) {
                max_value = arr[i];
            }
        }
        System.out.println(max_value);
    }
}