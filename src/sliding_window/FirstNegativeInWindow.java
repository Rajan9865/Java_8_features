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
 * 
 * @author Rajan kumar
 */
public class FirstNegativeInWindow {
	public static void main(String[] args) {
		long[] arr = { -8, 2, 3, -6, 10, -3, 7, -1 };
		long k = 3;
		long n=arr.length;
		System.out.print("First negative number in each window of size " + k + ": ");
		List<Long> result = printFirstNegative(arr, n, k);
		System.out.println(result);
	}

	/**
	 * @param arr
	 * @param n
	 * @param k
	 * @return
	 */
	private static List<Long> printFirstNegative(long[] arr, long n, long k) {
		Deque<Long> deque = new LinkedList<>();
		List<Long>result=new ArrayList<>();
		for(long i=0;i<k;i++) {
			if (arr[(int)i]<0) {
				deque.offerLast(i);
			}
		}
		for(long i=k;k<n;i++) {
			if (!deque.isEmpty()) {
                result.add(arr[(int)(long)deque.peekFirst()]);
			}else {
				result.add(0l);
			}
			while (!deque.isEmpty()&&deque.peekFirst()<i-k) {
				deque.pollFirst();
			}
			if (arr[(int)i] < 0) {
                deque.offerLast(i);
            }
		}
		if (!deque.isEmpty()) {
			result.add(arr[(int)(long)deque.peekFirst()]);
		} else {
			deque.add(0l);
		}
		return result;
	}

}
