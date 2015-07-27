package array;

import java.util.Arrays;

/**
 * Created by chengma on 7/26/15.
 */
public class RotateImage {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}
        };
        rotate(a);
        for (int[] arr : a) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int layer = 0; layer < matrix.length / 2; layer++) {
            for (int i = layer; i < n - layer - 1; i++) {
                int temp = matrix[layer][i];
                matrix[layer][i] = matrix[n - 1 - i][layer];
                matrix[n - 1 - i][layer] = matrix[n - 1 - layer][n - 1 - i];
                matrix[n - 1 - layer][n - 1 - i] = matrix[i][n - layer - 1];
                matrix[i][n - layer - 1] = temp;
            }
        }
    }
}
