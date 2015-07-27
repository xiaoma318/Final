package array;

/**
 * Created by chengma on 7/26/15.
 * Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum ≥ s. If there isn't one, return 0 instead.
 * <p>
 * For example, given the array [2,3,1,2,4,3] and s = 7,
 * the subarray [4,3] has the minimal length under the problem constraint.
 */
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int nums[] = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, nums));
    }
    public static int minSubArrayLen(int s, int[] nums) {
        int end = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;
        while (end < nums.length) {
            sum += nums[end];

            if (sum >= s) {
                while (start <= end && sum - nums[start] >= s) {
                    sum -= nums[start];
                    start++;
                }
                min = Math.min(min, end - start + 1);
            }
            end++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
