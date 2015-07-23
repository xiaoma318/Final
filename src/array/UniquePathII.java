package array;

/**
 * Created by chengma on 7/22/15.
 */
public class UniquePathII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int ways[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) ways[i][j] = 0;
                else {
                    if (i == 0 && j == 0) ways[i][j] = 1;
                    else if (i == 0) ways[i][j] = ways[i][j - 1];
                    else if (j == 0) ways[i][j] = ways[i - 1][j];
                    else ways[i][j] = ways[i][j - 1] + ways[i - 1][j];
                }
            }
        }
        return ways[m - 1][n - 1];
    }
}
