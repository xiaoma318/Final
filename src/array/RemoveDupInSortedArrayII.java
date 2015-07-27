package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chengma on 7/26/15.
 */
public class RemoveDupInSortedArrayII {
    public static void main(String[] args) {
        int nums[] ={1,1,1,2,2,3};
        int x = removeDuplicates2(nums);
        System.out.println(x);
    }

    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for(int x : nums){
            int count = 1;
            if(map.containsKey(x)){
                count = map.get(x) + 1;
                if(count > 2) continue;
            }

            nums[idx ++] = x;
            map.put(x, count);
        }
        return idx;
    }

    public static int removeDuplicates2(int[] nums) {
        if(nums.length < 3) return nums.length;
       int idx = 2;
        for(int i=2;i<nums.length;i++){
            if(nums[i] != nums[idx-2]) nums[idx++] = nums[i];
        }
        return idx;
    }
}
