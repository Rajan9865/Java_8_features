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
public class FirstNonRepeating {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 1, 2, 0, 4, 1, 2 };
		System.out.println(" non reapting element " + firstNonRepeating(arr));
	}

	/**
	 * @param arr
	 * @return
	 */
	private static int firstNonRepeating(int[] arr) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		for (int num : arr) {
			hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
		}
		for (int num : arr) {
			if (hashMap.get(num) == 1) {
				return num;
			}
		}
		return -1;
	}
}
