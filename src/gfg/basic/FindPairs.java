/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class FindPairs {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 8, 3, 5 };
		int target = 9;
		System.out.println("Pairs with sum 9:");
		findPairs(arr, target);
	}

	/**
	 * @param arr
	 * @param target
	 */
	private static void findPairs(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("(" + arr[i] + ", " + arr[j] + ")");
				}
			}
		}
	}
}
