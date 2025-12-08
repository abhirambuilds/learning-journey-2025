class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                int d = c - '1';
                if (rows[i][d] || cols[j][d] || boxes[(i / 3) * 3 + j / 3][d]) return false;
                rows[i][d] = cols[j][d] = boxes[(i / 3) * 3 + j / 3][d] = true;
            }
        }
        return true;
    }
}

