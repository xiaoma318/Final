package array;

/**
 * Created by chengma on 7/29/15.
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 0;
        for (int v : nums) {
            if (count == 0) {
                major = v;
                count = 1;
            } else if (v == major) {
                count++;
            } else count--;
        }
        return major;
    }
}
