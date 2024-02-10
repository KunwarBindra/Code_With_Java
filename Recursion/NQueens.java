package Recursion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueens {
    public static void StoreQueenPos(int n, char board[][], List<List<String>> allBoards) {
        String row = "";
        List<String> currentBoardPos = new ArrayList<>();
        for (int i=0; i<n; i++) {
            row = "";
            for (int j=0; j<n; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            currentBoardPos.add(row);
        }
        allBoards.add(currentBoardPos);
    }
    public static boolean IsQueenSafe(int row, int col, char board[][], int n) {
        for (int c=0; c<n; c++) {
            if (board[row][c] == 'Q') {
                return false;
            }
        }
        for (int r=0; r<n; r++) {
            if (board[r][col] == 'Q') {
                return false;
            }
        }
        for (int r=row+1, c=col+1; r<n && c<n; r++, c++) {
            if (board[r][col] == 'Q') {
                return false;
            }
        }
        for (int r=row-1, c=col+1; r>=0 && c<n; r--, c++) {
            if (board[r][col] == 'Q') {
                return false;
            }
        }
        for (int r=row-1, c=col-1; r>=0 && c>=0; r--, c--) {
            if (board[r][col] == 'Q') {
                return false;
            }
        }
        for (int r=row+1, c=col-1; r<n && c>=0; r++, c--) {
            if (board[r][col] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void QueenPos(int n, int col, char board[][], List<List<String>> allBoards) {
        if (col == n) {
            StoreQueenPos(n, board, allBoards);
            return;
        }
        for (int i=0; i<n; i++) {
            if (IsQueenSafe(i, col, board, n)) {
                board[i][col] = 'Q';
                QueenPos(n, col+1, board, allBoards);
                board[i][col] = '.';
            }
        }
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<String>> allBoards = new ArrayList<>();
        char board[][] = new char[n][n];
        QueenPos(n, 0, board, allBoards);
    }
}
