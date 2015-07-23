package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by chengma on 7/22/15.
 */
public class SummryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new LinkedList<>();
        if (nums == null || nums.length == 0) return res;
        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            long x = nums[i];
            long y = nums[i - 1];

            if (x - y > 1) {
                if (nums[i - 1] == start) {
                    res.add(start + "");
                } else {
                    res.add(start + "->" + nums[i - 1]);
                }
                start = nums[i];
            }
        }
        if (start == nums[nums.length - 1]) {
            res.add(start + "");
        } else {
            res.add(start + "->" + nums[nums.length - 1]);
        }

        return res;
    }
}
