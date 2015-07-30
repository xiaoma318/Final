package array;

/**
 * Created by chengma on 7/29/15.
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Determine if you are able to reach the last index.

 For example:
 A = [2,3,1,1,4], return true.

 A = [3,2,1,0,4], return false.
 */
public class JumpGame {
    public static void main(String[] args) {
       // int nums[] = {2,3,1,1,4};
        int nums[] = {1,1,2,2,0,1,1};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int canReach = 0;
        for(int i=0;i<=canReach&&i<nums.length;i++){
            canReach = Math.max(canReach, i + nums[i]);
            if(canReach >= nums.length-1) return true;
        }
        return false;
    }
}
