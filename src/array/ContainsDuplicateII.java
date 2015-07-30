package array;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by chengma on 7/29/15.
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
           if(i>k) set.remove(nums[i-k-1]);
           if(!set.add(nums[i])) return true;
        }
        return false;
    }
}
