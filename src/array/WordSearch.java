package array;

/**
 * Created by chengma on 7/22/15.
 */
public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "SEE";
        // String word = "ABCCED";
        // String word = "ABCB";
        System.out.println(exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) return false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, i, j, word, 0)) return true;
            }
        }
        return false;
    }

    static boolean dfs(char[][] board, int x, int y, String word, int n) {
        if (n == word.length())
            return true;
        if (x == -1 || y == -1 || x == board.length || y == board[0].length)
            return false;

        if (word.charAt(n) != board[x][y])
            return false;
        if (n == word.length() - 1)
            return true;

        board[x][y] ^= 256;
        boolean res = dfs(board, x - 1, y, word, n + 1)
                || dfs(board, x + 1, y, word, n + 1)
                || dfs(board, x, y - 1, word, n + 1)
                || dfs(board, x, y + 1, word, n + 1);
        board[x][y] ^= 256;

        return res;
    }
}
