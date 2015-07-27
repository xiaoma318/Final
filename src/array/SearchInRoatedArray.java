package array;

/**
 * Created by chengma on 7/26/15.
 */
public class SearchInRoatedArray {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 2));
    }
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) {
                if (nums[mid] >= nums[left]) {
                    if (nums[left] > target) left = mid + 1;
                    else right = mid - 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (nums[mid] >= nums[left]) {
                    left = mid + 1;
                } else {
                    if (nums[right] < target) right = mid - 1;
                    else left = mid + 1;
                }
            }
        }
        return -1;
    }
}
