package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chengma on 7/29/15.
 * Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
 * <p>
 * Each number in C may only be used once in the combination.
 * <p>
 * Note:
 * All numbers (including target) will be positive integers.
 * Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set 10,1,2,7,6,1,5 and target 8,
 * A solution set is:
 * [1, 7]
 * [1, 2, 5]
 * [2, 6]
 * [1, 1, 6]
 */
public class CombinationSumII {
    public static void main(String[] args) {
        int nums[] = {2, 2, 2};
        int target = 4;
        System.out.println(combinationSum2(nums, target));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    public static void helper(int c[], int t, int index, List<Integer> curr, List<List<Integer>> res) {
        if (t == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = index; i < c.length && c[i] <= t; i++) {
            if (i != 0 && c[i] == c[i - 1] && i > index) continue;
            curr.add(c[i]);
            helper(c, t - c[i], i + 1, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}
