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
public class FirstNegativeInWindow1 {
	public static void main(String[] args) {
		int[] arr = { -1, 2, -3, 4, 5, -6 };
		int k = 3;
		List<Integer> result = firstNegativeInteger(arr, k);
		System.out.println(result); // Output: [-1, -3, -3, -6]
	}
	static List<Integer> firstNegativeInteger(int arr[], int k) {
        Deque<Integer> deq = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        // Step 1: Process the first k elements
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                deq.offerLast(i);
            }
        }

        // Step 2: Process the rest of the elements
        for (int i = k; i < arr.length; i++) {
            // Add the first negative integer in the current window or 0 if none
            if (!deq.isEmpty()) {
                result.add(arr[deq.peekFirst()]);
            } else {
                result.add(0);
            }

            // Remove elements from the front of the deque which are outside the current window
            while (!deq.isEmpty() && deq.peekFirst() <= i - k) {
                deq.pollFirst();
            }

            // Add the current element if it's negative
            if (arr[i] < 0) {
                deq.offerLast(i);
            }
        }

        // Add the first negative integer of the last window or 0 if none
        if (!deq.isEmpty()) {
            result.add(arr[deq.peekFirst()]);
        } else {
            result.add(0);
        }

        return result;
    }
}
