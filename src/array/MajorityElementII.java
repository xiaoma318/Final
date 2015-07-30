package array;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by chengma on 7/29/15.
 * Given an integer array of size n, find all elements
 * that appear more than ⌊ n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.
 */
public class MajorityElementII {
    public static void main(String[] args) {
        int nums[] = {7, 7, 8, 8, 8};
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new LinkedList<>();
        if (nums.length == 0) return res;
        if (nums.length == 1) {
            res.add(nums[0]);
            return res;
        }
        int x = 0, y = 1;
        int countX = 0, countY = 0;
        for (int v : nums) {
            if (x == v) countX++;
            else if (y == v) countY++;
            else if (countX == 0) {
                countX = 1;
                x = v;
            } else if (countY == 0) {
                countY = 1;
                y = v;
            } else {
                countX--;
                countY--;
            }
        }
        countX = 0;
        countY = 0;

        for (int v : nums) {
            if (v == x) countX++;
            else if (v == y) countY++;
        }
        if (countX > nums.length / 3) res.add(x);
        if (countY > nums.length / 3) res.add(y);
        return res;
    }
}
