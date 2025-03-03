/**
 * 
 */
package interview.potd;

import java.util.Deque;
import java.util.LinkedList;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class FirstNegativeInWindow {
	public static void main(String[] args) {
		int[] arr = { -8, 2, 3, -6, 10, -3, 7, -1 };
		int k = 3;
		System.out.print("First negative number in each window of size " + k + ": ");
		printFirstNegative(arr, arr.length, k);
	}

	/**
	 * @param arr
	 * @param length
	 * @param k
	 */
	private static void printFirstNegative(int[] arr, int length, int k) {
		Deque<Integer> deque = new LinkedList<>();
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				deque.add(i);
			}
		}
		for (int i = k; i < length; i++) {
			if (!deque.isEmpty()) {
				System.out.print(arr[deque.peek()] + " ");
			} else {
				System.out.print("0 ");
			}
			while (!deque.isEmpty() && deque.peek() <= i - k) {
				deque.poll();
			}
			if (arr[i] < 0) {
				deque.add(i);
			}
		}
		if (!deque.isEmpty()) {
			System.out.print(arr[deque.peek()]);
		} else {
			System.out.print(0);
		}
	}

}
