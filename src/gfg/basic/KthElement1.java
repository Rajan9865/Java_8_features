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
public class KthElement1 {
	public static void main(String[] args) {
		int[] arr = { 3, 10, 7, 25, 15, 6 };
		int k = 2;
		System.out.println(+k + "th Smallest: " + findKthSmallest(arr, k));
		System.out.println(+k + "th Largest: " + findKthLargest(arr, k));
	}

	/**
	 * @param arr
	 * @param k
	 * @return
	 */
	private static int findKthLargest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[arr.length - k];
	}

	/**
	 * @param arr
	 * @param k
	 * @return
	 */
	private static int findKthSmallest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k - 1];
	}
}
