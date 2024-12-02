/**
 * 
 */
package gfg.basic;

import java.util.Arrays;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class StockBuyandSellMaxoneAllowed {
	public static void main(String[] args) {
		int[] prices = {7, 1, 5, 3, 6, 4};
		System.out.println("original price:");
		printPrice(prices);
		int masprofit= maxProfit(prices);
		System.out.println(masprofit);
	}

	/**
	 * @param prices
	 * @return
	 */
	private static int maxProfit(int[] prices) {
		if (prices == null && prices.length < 2) {
			return 0;
		}
		int minPrice=Integer.MAX_VALUE;
		int maxProfit=0;
		for (int i : prices) {
			 minPrice = Math.min(minPrice, i);
			maxProfit = Math.max(maxProfit,i-minPrice);
		}
		return maxProfit;
	}

	/**
	 * @param prices
	 */
	private static void printPrice(int[] prices) {
		// TODO Auto-generated method stub
		Arrays.stream(prices).forEach(num->System.out.print(num+" "));
		System.out.println();
		
	}
}
