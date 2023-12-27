import java.util.Scanner;
public class MaxMinInArray {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }
        for (int i=0; i<size; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        };
        System.out.print("Maximum and Minimum are:" + max + "," + min);
    }
}