/**
 * 
 */
package interview.potd;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class KSizedSubarrayMaximum {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
		int k = 3;
		List<Integer> result = maxOfSubarrays(arr, k);
		System.out.println(result);
	}

	private static List<Integer> maxOfSubarrays(int[] arr, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		Deque<Integer> deque = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			if (!deque.isEmpty() && deque.peekFirst() == i - k) {
				deque.pollFirst();
			}
			while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
				deque.pollFirst();
			}
			deque.offerLast(i);
			if (i >= k - 1) {
				result.add(arr[deque.peekFirst()]);
			}
		}
		return result;
	}

}
