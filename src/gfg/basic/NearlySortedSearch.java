/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class NearlySortedSearch {
	public static void main(String[] args) {
		int[] arr = { 10, 3, 50, 20, 50, 80, 70 };
		int k = 2;
		int target = 20;
		System.out.println("Found at index: " + searchNearlySorted(arr, target, k));
	}

	/**
	 * @param arr
	 * @param target
	 * @param k
	 * @return
	 */
	private static int searchNearlySorted(int[] arr, int target, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (i - k >= 0 && arr[i - k] == target) {
				return i - k;
			}
			if (i + k < arr.length && arr[i + k] == target) {
				return i + k;
			}
		}
		return -1;
	}
}
