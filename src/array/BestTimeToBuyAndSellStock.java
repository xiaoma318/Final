package array;

/**
 * Created by chengma on 7/29/15.
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share
 * of the stock), design an algorithm to find the maximum profit.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            max = Math.max(prices[i] - min, max);
            min = Math.min(prices[i], min);
        }
        return max;
    }
}
