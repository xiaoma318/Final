package array;

import java.util.Arrays;

/**
 * Created by chengma on 7/26/15.
 */
public class SearchForARange {
    public static void main(String[] args) {
        int nums[] = {5, 7, 7, 8, 8, 10};
       int a[] = searchRange(nums, 10);
        System.out.println(Arrays.toString(a));
    }
    public static int[] searchRange(int[] nums, int target) {
        int leftIdx = searchGreaterOrEqual(nums, target);
        if (leftIdx == nums.length || nums[leftIdx] != target) {
            return new int[]{-1, -1};
        }

        int rightIdx = searchGreaterOrEqual(nums, target + 1);
        return new int[]{leftIdx, rightIdx - 1};
    }

    public static int searchGreaterOrEqual(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) right = mid;
            else left = mid + 1;
        }
        return right;
    }
}
