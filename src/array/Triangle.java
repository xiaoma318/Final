package array;

import java.util.List;

/**
 * Created by chengma on 7/22/15.
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int sum[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int temp[] = new int[n];
            for (int j = 0; j <= i; j++) {
                if (i == n - 1) temp[j] = triangle.get(i).get(j);
                else temp[j] = Math.min(sum[j], sum[j + 1]) + triangle.get(i).get(j);
            }
            sum = temp;
        }
        return sum[0];
    }
}
