package array;

import java.util.Arrays;

/**
 * Created by chengma on 7/26/15.
 */
public class SpiralMatrixII {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(3);
        for (int[] array : matrix) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;
        int rowBegin = 0, rowEnd = n - 1;
        int colBegin = 0, colEnd = n - 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int j = colBegin; j <= colEnd; j++) {
                matrix[rowBegin][j] = count++;
            }
            rowBegin++;
            for (int i = rowBegin; i <= rowEnd; i++) {
                matrix[i][colEnd] = count++;
            }
            colEnd--;
            for (int j = colEnd; j >= colBegin; j--) {
                matrix[rowEnd][j] = count++;
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowBegin; i--) {
                matrix[i][colBegin] = count++;
            }
            colBegin++;
        }
        return matrix;
    }
}
