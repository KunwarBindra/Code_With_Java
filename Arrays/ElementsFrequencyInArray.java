package Arrays;
// not optimised method
import java.util.Scanner;
public class ElementsFrequencyInArray {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        int current = arr[0];
        int count = 1;
        for(int i=1; i<arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                System.out.println(current + " printed " + count + " times ");
                current = arr[i];
                count = 1;
                if (i == arr.length-1) {
                    System.out.println(current + " printed " + count + " times ");
                } 
            } else if ((i == arr.length-1) && (arr[i] == arr[i-1])) {
                count++;
                System.out.println(current + " printed " + count + " times ");
            } else if (arr[i] == arr[i-1]) {
                count++;
            }
        }
    }
}