import java.util.Scanner;

public class FindCSDNumber {
    public static boolean isCSDNum(int num) {
        if (num == 2 || num == 3 || num == 5 || num == 7
                || num == 11 || num == 13 || num == 17 || num == 19 || num == 23
                || num == 29) {
            return true;
        }
        if (num != 0 && num != 1 && num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0
                && num % 11 != 0 && num % 13 != 0 && num % 17 != 0 && num % 19 != 0 && num % 23 != 0
                && num % 29 != 0) {
            return true;
        }
        return false;
    }

    public static boolean isValid(boolean visited[], int start, int end) {
        for (int i = start; i < end; i++) {
            if (visited[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numStr = sc.nextLine();
        boolean visited[] = new boolean[numStr.length()];
        String newStr = "";
        int csdCount = 0;
        for (int i = 0; i < numStr.length(); i++) {
            newStr = "";
            char currentChar = numStr.charAt(i);
            newStr += currentChar;
            int newNum = Integer.parseInt(newStr);
            if (isCSDNum(newNum) && isValid(visited, i, i+1)) {
                csdCount += 1;
                for (int k=i; k<i+1; k++) {
                    visited[k] = true;
                }
            }
            for (int j = i + 1; j < numStr.length(); j++) {
                currentChar = numStr.charAt(j);
                newStr += currentChar;
                newNum = Integer.parseInt(newStr);
                if (isCSDNum(newNum) && isValid(visited, i, j+1)) {
                    csdCount += 1;
                    for (int k=i; k<j+1; k++) {
                        visited[k] = true;
                    }
                }
            }
        }
        System.out.println(csdCount);
    }
}
