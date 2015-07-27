package array;

/**
 * Created by chengma on 7/26/15.
 */
public class SearchMatrix {
    //logm+logn
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (matrix[mid][0] == target) return true;
            if (matrix[mid][0] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (left - 1 < 0 || left - 1 > matrix.length - 1) return false;
        int row = left - 1;
        left = 0;
        right = matrix[0].length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (matrix[row][mid] == target) return true;
            if (matrix[row][mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    //m+n
    public boolean searchMatrix2(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col >-1){
            if(matrix[row][col] == target) return true;
            if(matrix[row][col] > target) col--;
            else row++;
        }
        return false;
    }
}
