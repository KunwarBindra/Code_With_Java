import java.util.Scanner;

public class Factorial {

    public static int factorial(int N) {
        if (N == 1 || N == 0){
            return 1;
        }
        int nMinusOne = factorial(N-1);
        System.out.println(nMinusOne);
        int factorial_num = N * nMinusOne;
        return factorial_num;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // long factorial = N;
        // for(int i=N-1; i>0; i--) {
        //     factorial *= i;
        // }
        // System.out.println(factorial);
        int factorial_num = factorial(N);
        System.out.println(factorial_num);
    }
}
