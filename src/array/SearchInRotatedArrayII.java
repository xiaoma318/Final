package array;

/**
 * Created by chengma on 7/26/15.
 */
public class SearchInRotatedArrayII {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return true;

            if (nums[mid] == nums[left] && nums[mid] == nums[right]) {
                left++;
                right--;
            } else if (nums[mid] == nums[left]) {
                left = mid + 1;
            } else if (nums[mid] == nums[right]) {
                right = mid - 1;
            } else if (nums[mid] > target) {
                if (nums[mid] > nums[left]) {
                    if (nums[left] > target) left = mid + 1;
                    else right = mid - 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (nums[mid] > nums[left]) {
                    left = mid + 1;
                } else {
                    if (nums[right] < target) right = mid - 1;
                    else left = mid + 1;
                }
            }
        }
        return false;
    }
}
