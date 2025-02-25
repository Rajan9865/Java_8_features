/**
 * 
 */
package interview.potd;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class MaximumProfit {
	public static void main(String[] args) {
		int[] price= {2,1,3,6,8,110};
		int maximumProfit=maximumProfit(price);
		System.out.println(maximumProfit);
	}

	/**
	 * @param price
	 * @return
	 */
	private static int maximumProfit(int[] price) {
		int minPrice=-1;
		int maxPrice=0;
		for (int i : price) {
			if (minPrice == -1) {
                minPrice = i;  // Initialize minPrice with the first price value.
            }
			minPrice=Math.min(minPrice, i);
			maxPrice=Math.max(maxPrice, i-minPrice);
		}
		return maxPrice;
	}
}
