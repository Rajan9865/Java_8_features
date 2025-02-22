/**
 * 
 */
package gfg.basic;

import java.util.Arrays;
import java.util.List;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class BalancedArray {
	public static void main(String[] args) {
		List<Integer> arr1 = Arrays.asList(1, 5, 3, 2);
		System.out.println("Test case 1: " + minValueToBalance(arr1));
	}

	/**
	 * @param arr1
	 * @return
	 */
	private static int minValueToBalance(List<Integer> arr1) {
		int n = arr1.size();
		int mid = n / 2;
		int leftSum = 0;
		int rightSum = 0;
		for (int i = 0; i < mid; i++) {
			leftSum += arr1.get(i);
		}
		for (int i = mid; i < n; i++) {
			rightSum += arr1.get(i);
		}
		if (leftSum == rightSum) {
			return 0;
		}
		return Math.abs(leftSum - rightSum);
	}
}
