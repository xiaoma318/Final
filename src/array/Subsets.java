package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chengma on 7/22/15.
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        return subsetsHelper(nums, nums.length - 1);
    }

    List<List<Integer>> subsetsHelper(int[] nums, int index) {
        List<List<Integer>> res = new ArrayList<>();
        if (index == -1) {
            res.add(new ArrayList<Integer>());
            return res;
        }
        for (List<Integer> item : subsetsHelper(nums, index - 1)) {
            List<Integer> newItem = new ArrayList<>(item);
            newItem.add(nums[index]);
            res.add(item);
            res.add(newItem);
        }
        return res;
    }

    public List<List<Integer>> subsets2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        for (int i = 0; i < nums.length; i++) {
            int size = res.size();
            for (int j = 0; j < size; j++) {
                List<Integer> newItem = new ArrayList<>(res.get(j));
                newItem.add(nums[i]);
                res.add(newItem);
            }
        }
        return res;
    }
}
