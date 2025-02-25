/**
 * 
 */
package interview.potd;

import java.util.HashMap;
import java.util.Map;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class Majority {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5 };
		int x = 4;
		int y = 5;
		int length = arr.length;
		System.out.println("majprity element is " + majorityWins(arr, length, x, y));
		System.out.println("majprity element is " + majorityWins1(arr, length, x, y));
	}
	private static int majorityWins(int[] arr, int length, int x, int y) {
		int countx = 0;
		int county = 0;
		for (int i = 0; i < length; i++) {
			if (arr[i] == x) {
				countx++;
			} else if (arr[i] == y) {
				county++;
			}
		}
		if (countx > county) {
			return x;
		} else if (county > countx) {
			return y;
		} else {
			return Math.min(x, y);
		}
	}
	private static int majorityWins1(int[] arr, int length, int x, int y) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int countx = map.getOrDefault(x, 0);
		int county = map.getOrDefault(y, 0);
		if (countx > county) {
			return x;
		} else if (county > countx) {
			return y;
		} else {
			return Math.min(x, y);
		}
	}
}
