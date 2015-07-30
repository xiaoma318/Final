package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chengma on 7/29/15.
 * Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.
 * <p>
 * Ensure that numbers within the set are sorted in ascending order.
 * <p>
 * Example 1:
 * Input: k = 3, n = 7
 * Output:
 * [[1,2,4]]
 * <p>
 * Example 2:
 * Input: k = 3, n = 9
 * Output:
 * [[1,2,6], [1,3,5], [2,3,4]]
 */
public class CombinationSumIII {
    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 9));
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        helper(n, k, 1, new ArrayList<>(), res);
        return res;
    }

    public static void helper(int n, int k, int index, List<Integer> curr, List<List<Integer>> res) {
        if (k == 0) {
            if (n == 0)
                res.add(new ArrayList<>(curr));
            return;
        }

        for (int j = index; j <= 9 && j <= n; j++) {
            curr.add(j);
            helper(n - j, k - 1, j + 1, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}
