package Recursion;
import java.util.Scanner;

public class InvitingGuests {
    public static int GuestCall(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        int single = GuestCall(n-1);
        int pair = (n-1) * GuestCall(n-2);
        return single + pair;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(GuestCall(n));
    }
}
