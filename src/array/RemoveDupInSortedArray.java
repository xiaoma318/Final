package array;

/**
 * Created by chengma on 7/26/15.
 */
public class RemoveDupInSortedArray {
    public int removeDuplicates(int[] nums) {
        int idx = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[idx-1]) nums[idx++] = nums[i];
        }
        return idx;
    }
}
