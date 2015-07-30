package array;

/**
 * Created by chengma on 7/27/15.
 */
public class MaximumProductSubarray {
    public static void main(String[] args) {
        int nums[] = {-1,-2,-9,-6};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currMax = 1;
        int currMin = 1;
        for(int val : nums){
            if(val > 0){
                currMax *= val;
                currMin *= val;
                if(currMin > 0) currMin = 1;
                max = Math.max(max, currMax);
            }else if(val < 0){
                int tmp = currMax;
                currMax = currMin * val;
                currMin = tmp * val;
                max = Math.max(max, currMax);
                if(currMax < 0) currMax = 1;
            }else{
                max = Math.max(0, max);
                currMax = 1;
                currMin = 1;
            }
        }
        return max;
    }
}
