package Strings;
// string sorting using selection sort

import java.util.Scanner;
public class StringsSorting {

    public static void printArr(String arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String []args) {
        String arr[] = {"Kunwar", "Raunak", "Karan", "Samar", "Arushi", "Pawandeep", "Vikram", "Arjun", "Amardeep", "Daman", "Sahiba", "Chinki"};

        // Using Selection sort

        // for (int i=0; i<arr.length-1; i++) {
        //     int smallest = i;
        //     for (int j=i+1; j<arr.length; j++) {
        //         if (arr[smallest].compareTo(arr[j]) > 0) {
        //             smallest = j;
        //         }
        //     }
        //     String temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }

        // Using Insertion sort

        for (int i=1; i<arr.length; i++) {
            String current = arr[i];
            int j = i-1;
            while (j>=0 && arr[j].compareTo(current) > 0) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArr(arr);
    }
}