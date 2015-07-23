package array;

import java.util.*;

/**
 * Created by chengma on 7/23/15.
 */
public class SubsetsII {
    public static void main(String[] args) {
        int nums[] = {5, 5, 5, 5, 5};
        System.out.println(subsetsWithDup2(nums));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            int j;
            if (i != 0 && nums[i] == nums[i - 1]) j = size;
            else j = 0;
            size = res.size();
            for (; j < size; j++) {
                List<Integer> item = res.get(j);
                List<Integer> newItem = new ArrayList<>(item);
                newItem.add(nums[i]);
                res.add(newItem);
            }
        }
        return res;
    }

    public static List<List<Integer>> subsetsWithDup2(int[] nums) {
        Arrays.sort(nums);
        return new ArrayList<>(subsetsHelper(nums, nums.length - 1));
    }

    static Set<List<Integer>> subsetsHelper(int[] nums, int index) {
        Set<List<Integer>> res = new HashSet<>();
        if (index == -1) {
            res.add(new ArrayList<>());
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
}
