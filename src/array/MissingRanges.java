package array;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by chengma on 7/26/15.
 * Given a sorted integer array where the range of elements are [lower, upper] inclusive, return its missing ranges.
 * For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, return [“2”, “4->49”, “51->74”, “76->99”]
 */
public class MissingRanges {
    public static void main(String[] args) {
        int A[] = { 2, 3, 50, 75};
        System.out.println(findMissingRanges(A, 0, 99));
    }

    public static List<String> findMissingRanges(int[] A, int lower, int upper) {
        List<String> res = new LinkedList<>();
        if (lower < A[0]) {
            if (A[0] - lower > 1) res.add(lower + "->" + (A[0]-1));
            else res.add(lower + "");
        }
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i - 1] + 1) continue;
            if (A[i] == A[i - 1] + 2) res.add((A[i - 1] + 1) + "");
            else res.add((A[i - 1] + 1) + "->" + (A[i] - 1));
        }
        if (A[A.length - 1] < upper) {
            if (upper - A[A.length - 1] > 1) res.add((A[A.length - 1] +1) + "->" + upper);
            else res.add(upper + "");
        }
        return res;
    }
}
