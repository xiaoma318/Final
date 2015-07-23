package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chengma on 7/22/15.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]) + 1, i + 1};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
