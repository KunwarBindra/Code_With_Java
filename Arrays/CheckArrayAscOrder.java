package Arrays;
import java.util.Scanner;
public class CheckArrayAscOrder {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        int temp = Integer.MIN_VALUE;
        for (int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }
        for (int i=0; i<size; i++) {
            if (temp < array[i]) {
                temp = array[i];
            } else {
                System.out.print("Array is not in asc order");
                break;
            }
            if (i == size-1) {
                System.out.print("Array is in asc order");
            }
        };
    }
}