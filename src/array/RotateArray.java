package array;

import java.util.Arrays;

/**
 * Created by chengma on 7/26/15.
 */
public class RotateArray {
    public static void main(String[] args) {
        int nums[] = {1};
        rotate(nums, 0);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        if(k == 0) return;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

    static void reverse(int nums[], int left, int right) {
        if(left > right) return;
        for (int i = left; i <= left + (right - left) / 2; i++) {
            int tmp = nums[i];
            nums[i ] = nums[right -(i-left)];
            nums[right -(i-left)] = tmp;
        }
    }
}
