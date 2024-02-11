// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

// Each row must contain the digits 1-9 without repetition.
// Each column must contain the digits 1-9 without repetition.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
// Note:

// A Sudoku board (partially filled) could be valid but is not necessarily solvable.
// Only the filled cells need to be validated according to the mentioned rules.

package Neetcode150;

class Solution {
    public boolean isSafe(char[][] board, int row, int column, char current) {
        // check column
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == current && i != row) {
                return false;
            }
        }
        // check row
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == current && j != column) {
                return false;
            }
        }
        // check grid
        int gridRow = 3 * (row / 3);
        int gridCol = 3 * (column / 3); // starting coordinates of a specific grid
        for (int i = gridRow; i < gridRow + 3; i++) {
            for (int j = gridCol; j < gridCol + 3; j++) {
                if (board[i][j] == current && i != row && j != column) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        boolean isValid = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    if (isSafe(board, i, j, board[i][j])) {
                        isValid = true;
                    } else {
                        isValid = false;
                        return isValid;
                    }
                }
            }
        }
        return isValid;
    }
}
