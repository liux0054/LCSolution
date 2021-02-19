package medium;

public class LC79 {
    public boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[200][200];
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                if (match(board, used,0, i, j, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean match(char[][] board, boolean[][] used, int index, int row, int column, String word) {
        if (!used[row][column] && board[row][column] == word.charAt(index)) {
            if (index == word.length()-1) {
                return true;
            }
            used[row][column] = true;
            boolean up = row > 0 && !used[row-1][column] && match(board, used, index+1, row-1, column, word);
            if (up) {
                return true;
            }
            boolean down = row < board.length - 1 && !used[row+1][column] && match(board, used, index+1, row+1, column, word);
            if (down) {
                return true;
            }
            boolean left = column > 0 && !used[row][column-1] && match(board, used, index+1, row, column-1, word);
            if (left) {
                return true;
            }
            boolean right = column < board[row].length - 1 && !used[row][column+1] && match(board, used, index+1, row, column+1, word);
            if (right) {
                return true;
            }
            used[row][column] = false;
            return false;
        } else {
            return false;
        }
    }
}
