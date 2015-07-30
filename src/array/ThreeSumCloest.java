package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chengma on 7/29/15.
 * Given an array S of n integers, find three integers in S such that the sum
 * is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * <p>
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * <p>
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class ThreeSumCloest {
    public static void main(String[] args) {
        int nums[] = {-1, 2, 1, -4};
        System.out.println(threeSumClosest(nums, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum == target) {
                    return target;
                }

                if (Math.abs(sum - target) < Math.abs(min - target)) {
                    min = sum;
                }

                if (sum < target) {
                    left++;
                } else right--;
            }
        }
        return min;
    }
}
