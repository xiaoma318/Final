package array;

/**
 * Created by chengma on 7/27/15.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int value:nums){
            sum+=value;
            max=Math.max(max,sum);
            if(sum<0) sum=0;
        }
        return max;
    }
}
