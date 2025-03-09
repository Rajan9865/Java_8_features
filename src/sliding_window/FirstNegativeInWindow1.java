/**
 * 
 */
package sliding_window;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * sliding_window
 *@author Rajan kumar
 */

public class FirstNegativeInWindow1 {
    public static void main(String[] args) {
        long[] A = { -1, 2, -3, 4, 5, -6 };
        long N = A.length;
        long K = 3;

        List<Long> result = printFirstNegativeInteger(A, N, K);
        System.out.println(result);  // Output: [-1, -3, -3, -6]
    }

    private static List<Long> printFirstNegativeInteger(long[] A, long N, long K) {
        Deque<Long> deq = new LinkedList<>();
        List<Long> result = new ArrayList<>();

        // Step 1: Process the first K elements
        for (long i = 0; i < K; i++) {
            if (A[(int)i] < 0) {
                deq.offerLast(i);
            }
        }

        // Step 2: Process the rest of the elements
        for (long i = K; i < N; i++) {
            // Add the first negative integer in the current window or 0 if none
            if (!deq.isEmpty()) {
                result.add(A[(int)(long)deq.peekFirst()]);
            } else {
                result.add(0L);
            }

            // Remove elements from the front of the deque which are outside the current window
            while (!deq.isEmpty() && deq.peekFirst() <= i - K) {
                deq.pollFirst();
            }

            // Add the current element if it's negative
            if (A[(int)i] < 0) {
                deq.offerLast(i);
            }
        }

        // Add the first negative integer of the last window or 0 if none
        if (!deq.isEmpty()) {
            result.add(A[(int)(long)deq.peekFirst()]);
        } else {
            result.add(0L);
        }

        return result;
    }
}
