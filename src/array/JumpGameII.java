package array;

/**
 * Created by chengma on 7/29/15.
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Your goal is to reach the last index in the minimum number of jumps.

 For example:
 Given array A = [2,3,1,1,4]

 The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
 */
public class JumpGameII {
    public static void main(String[] args) {
        int nums[] = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
    public static int jump(int[] nums) {
        int currMax = 0;
        int maxRange = currMax;
        int step = 0;
        for (int i = 0; i<=currMax && i<nums.length; i++){
            if(currMax >= nums.length-1) return step ;
            maxRange = Math.max(maxRange, i + nums[i]);
            if(i == currMax){
                currMax = maxRange;
                step ++;
            }
        }
        return -1;
    }
}
