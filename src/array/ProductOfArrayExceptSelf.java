package array;

import java.util.Arrays;

/**
 * Created by chengma on 7/26/15.
 */
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        int res[] = productExceptSelf2(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            left[i] = i == 0 ? nums[i] : left[i - 1] * nums[i];
            right[n - 1 - i] = i == 0 ? nums[n - 1 - i] : right[n - i] * nums[n - 1 - i];
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) res[i] = right[i + 1];
            else if (i == n - 1) res[i] = left[i - 1];
            else res[i] = left[i - 1] * right[i + 1];
        }
        return res;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int res[] = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 1, right = 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
