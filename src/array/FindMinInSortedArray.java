package array;

/**
 * Created by chengma on 7/29/15.
 */
public class FindMinInSortedArray {
    public static void main(String[] args) {
        int nums[] = {10, 1, 10, 10, 10};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right ){
            if(nums[left] < nums[right]) return nums[left];
            int mid = (left + right) / 2;
            if(nums[mid] == nums[left]){
                left ++;
            }
            else if(nums[mid] > nums[left]){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return nums[left];
    }
}
