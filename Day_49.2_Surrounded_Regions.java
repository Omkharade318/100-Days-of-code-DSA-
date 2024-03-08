public class Solution {

    private char[][] board;
    private int R, C;

    public void solve(char[][] board) {

        this.board = board;

        R = board.length;
        C = board[0].length;

        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                
                if (row == 0 || col == 0 || row == R-1 || col == C-1) {
                    if (board[row][col] == 'O') {
                        rec(row, col);
                    }
                }

            }
        }

        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                if (board[row][col] == 'E') {
                    board[row][col] = 'O';
                } else if (board[row][col] == 'O') {
                    board[row][col] = 'X';
                }
            }
        }


    }

    
    private void rec(int row, int col) {

        if (row < 0 || row >= R || col < 0 || col >= C || board[row][col] == 'X' || board[row][col] == 'E') {
            return;
        }

        board[row][col] = 'E';

        
        rec(row-1, col);
        rec(row+1, col);
        rec(row, col-1);
        rec(row, col+1);

    }

}
