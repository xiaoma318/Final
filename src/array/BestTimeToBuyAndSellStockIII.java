package array;

/**
 * Created by chengma on 7/29/15.
 */
public class BestTimeToBuyAndSellStockIII {
    public int maxProfit(int[] prices) {
        int[] left = new int[prices.length];
        left[0] = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            left[i] = Math.max(left[i - 1], prices[i] - min);
            min = Math.min(min, prices[i]);
        }

        int rightMax = prices[prices.length - 1];
        int max = 0;

        for (int i = prices.length - 1; i > -1; i--) {
            max = Math.max(left[i] + rightMax - prices[i], max);
            rightMax = Math.max(rightMax, prices[i]);
        }
        return max;
    }
}
