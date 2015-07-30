package array;

/**
 * Created by chengma on 7/29/15.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length - 1;
        while(left < right){
            int sum = (right - left) * Math.min(height[left], height[right]);
            max = Math.max(sum, max);
            if(height[left]<=height[right]) left++;
            else right--;
        }
        return max;
    }
}
