/**
 * 
 */
package sliding_window;

import java.util.ArrayList;
import java.util.List;

/**
 * sliding_window
 * 
 * @author Rajan kumar
 */
public class CountEvenNumbersInSubarray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 8 };
		int k = 3;
		System.out.println(
				"Count of even numbers in each subarray of size " + k + " is: " + countEvensInSubarrays(arr, k));
	}

	/**
	 * @param arr
	 * @param k
	 * @return
	 */
	private static List<Integer> countEvensInSubarrays(int[] arr, int k) {
		List<Integer> result = new ArrayList<>();
		int evenCount = 0;
		for (int i = 0; i < k; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			}
		}
		result.add(evenCount);
		for (int i = k; i < arr.length; i++) {
			if (arr[i - k] % 2 == 0) {
				evenCount--;
			}
			if (arr[i] % 2 == 0) {
				evenCount++;
			}
			result.add(evenCount);
		}
		return result;
	}
}