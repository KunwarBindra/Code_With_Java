import java.util.Scanner;

public class TowerOfHanoi {
    public static void TowerOfHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Disk " + n + " was moved from " + source + " to " + destination);
            return;
        }
        TowerOfHanoi(n-1, source, destination, helper);
        System.out.println("Disk " + n + " was moved from " + source + " to " + destination);
        TowerOfHanoi(n-1, helper, source, destination);
        return;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        TowerOfHanoi(N, "S", "H", "D");       
    }
}
