package array;

/**
 * Created by chengma on 7/29/15.
 * A peak element is an element that is greater than its neighbors.

 Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

 The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

 You may imagine that num[-1] = num[n] = -∞.

 For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 */
public class FindPeakElement {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        for(int i=0;i<nums.length;i++){
            if(i==0 ){
                if(nums[i] > nums[i+1]) return i;
            }else if(i==nums.length-1){
                if(nums[i] > nums[i-1]) return i;
            }else if(nums[i] > nums[i-1] && nums[i] > nums[i+1])
                return i;
        }
        return -1;
    }
}
