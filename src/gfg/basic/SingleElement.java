/**
 * 
 */
package gfg.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class SingleElement {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 7, 3, 2, 7, 5, 2, 99 };
		System.out.println("Unique element: " + findUnique(arr));
	}

	/**
	 * @param arr
	 * @return
	 */
	private static int findUnique(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (int num : arr) {
			if (map.get(num) == 1) {
				return num;
			}
		}
		return -1;
	}
}
