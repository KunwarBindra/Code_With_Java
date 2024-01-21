import java.util.Scanner;

public class SubstringAfterKChanges { // need to review
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        StringBuilder outputStr = new StringBuilder(str);
        int maxLength = 0;
        String arr[] = {"a", "b"};
        int arrFrequency[] = new int[2];
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'a') {
                arrFrequency[0] += 1;
            } 
            if (str.charAt(i) == 'b') {
                arrFrequency[1] += 1;
            }
        }
        int maxFrequency = 0;
        int maxFrequencyIndex = 0;
        for (int i=0; i<arrFrequency.length; i++) {
            if (arrFrequency[i] > maxFrequency) {
                maxFrequency = arrFrequency[i];
                maxFrequencyIndex = i;
            }
        }
        if (arr[maxFrequencyIndex] == "b") {
            int i = 0;
            while (i<str.length() && k>0) {
                if (str.charAt(i) == 'a') {
                    outputStr.setCharAt(i, 'b');
                    k--;
                }
                i++;
            }
            for (int j=0; j<outputStr.length(); j++) {
                if (outputStr.charAt(j) == 'b') {
                    maxLength += 1;
                }
            }
            System.out.println(maxLength);
        } else {
            int i = 0;
            while (i<str.length() && k>0) {
                if (str.charAt(i) == 'b') {
                    outputStr.setCharAt(i, 'a');
                    k--;
                }
                i++;
            }
            for (int j=0; j<outputStr.length(); j++) {
                if (outputStr.charAt(j) == 'a') {
                    maxLength += 1;
                }
            }
            System.out.println(maxLength);
        }
    }
}
