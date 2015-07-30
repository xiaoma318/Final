package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chengma on 7/29/15.
 * Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
 * <p>
 * The same repeated number may be chosen from C unlimited number of times.
 * <p>
 * Note:
 * All numbers (including target) will be positive integers.
 * Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set 2,3,6,7 and target 7,
 * A solution set is:
 * [7]
 * [2, 2, 3]
 */
public class CombinationSum {
    public static void main(String[] args) {
        int a[] = {2,3,6,7};
        long d1 = System.nanoTime();
        System.out.println(combinationSum(a, 7));
        long d2 = System.nanoTime();
        System.out.println(d2-d1);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            curr.add(c[i]);
            helper(c, t - c[i], i, curr, res);
            curr.remove(curr.size() -1 );
        }
    }
}
