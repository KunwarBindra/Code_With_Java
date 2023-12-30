import java.util.Scanner;

public class Factorial {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long factorial = N;
        for(int i=N-1; i>0; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
