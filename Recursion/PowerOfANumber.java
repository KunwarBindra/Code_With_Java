package Recursion;
import java.util.Scanner;

public class PowerOfANumber {

    public static int power(int x, int n) {
        System.out.println("x:" + x + " " + "n:" + n);
        if (n == 1){
            System.out.println("--------");
            return x;
        }
        if (x == 0){
            return 0;
        }
        // int powerReturned = power(x,n-1);
        // int powerOfANumber = x * powerReturned;
        // return powerOfANumber;
        if (n % 2 == 0) {
            System.out.println("even");
            // int powerReturned = power(x, n/2) * power(x, n/2);
            // System.out.println("returned value:" + powerReturned);
            // return powerReturned;
            return power(x, n/2) * power(x, n/2); // har n level pe ye line pehle puuri solve hogi
        } else {
            System.out.println("odd");
            // int powerReturned = power(x, n/2) * power(x, n/2);
            // System.out.println("returned value:" + powerReturned);
            // return powerReturned * x;
            return power(x, n/2) * power(x, n/2) * x; // har n level pe ye line pehle puuri solve hogi
        }
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int powerOfANumber = power(x,n);
        System.out.println("power of a number:" + powerOfANumber);
    }
}