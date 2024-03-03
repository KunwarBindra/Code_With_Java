package Neetcode150;
import java.util.ArrayList;
import java.util.List;

// The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

// Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

// Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

class Solution {
    public boolean IsQueenSafe(int row, int col, char[][] board) {
        // horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // upper right
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower left
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower right
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;

    }

    public void StoreQueenPos(char board[][], List<List<String>> allBoards) {
        String row = "";
        List<String> currentBoardPos = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
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

    public void QueenPos(int col, char board[][], List<List<String>> allBoards) {
        if (col == board.length) {
            StoreQueenPos(board, allBoards);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (IsQueenSafe(i, col, board)) {
                board[i][col] = 'Q';
                QueenPos(col + 1, board, allBoards);
                board[i][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char board[][] = new char[n][n];
        QueenPos(0, board, allBoards);
        return allBoards;
    }
}
