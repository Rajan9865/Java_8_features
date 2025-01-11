/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class MaximumPrice {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 10, 12 };
		System.out.println("Maximum profit : " + maximumProfit(arr));
	}

	/**
	 * @param arr
	 * @return
	 */
	private static int maximumProfit(int[] arr) {
		int minPrice=Integer.MAX_VALUE;
		int maxPrice=0;
		for (int i : arr) {
			minPrice=Math.min(minPrice, i);
			maxPrice=Math.max(maxPrice, i-minPrice);
		}
		return maxPrice;
	}

}
