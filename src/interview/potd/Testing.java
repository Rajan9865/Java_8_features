/**
 * 
 */
package interview.potd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * interview.potd 
 * @author Rajan kumar
 */
public class Testing {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 1, 3, 2, 1 };
		int[] arr2 = { 2, 2, 1, 3, 1, 1 };
//		boolean result = compareToArray(arr1, arr2);
		boolean result1 = compareToArray1(arr1, arr2);
		System.out.println(result1);

	}

	/**
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	private static boolean compareToArray1(int[] arr1, int[] arr2) {
		Map<Integer, Integer> numberMap = new HashMap<>();
		for (int num : arr1) {
			numberMap.put(num, numberMap.getOrDefault(num, 0) + 1);
		}
		for (int num : arr2) {
			if (!numberMap.containsKey(num)) {
				return false;
			}
			int count = numberMap.get(num);
			if (count == 1) {
				numberMap.remove(num);
			} else {
				numberMap.put(num, count - 1);
			}
		}
		return numberMap.isEmpty();
	}

	/**
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	private static boolean compareToArray(int[] arr1, int[] arr2) {
		Map<Integer, Integer> num2 = new HashMap<>();
		Map<Integer, Integer> nuMap = new HashMap<>();
		for (int num : arr1) {
			if (!nuMap.containsKey(num)) {
				nuMap.put(num, nuMap.getOrDefault(num, 0) + 1);
			}
			nuMap.put(num, 1);
		}
		for (int nummber : arr2) {
			if (num2.containsKey(nummber)) {
				num2.put(nummber, num2.getOrDefault(nummber, 0) + 1);
			}
			num2.put(nummber, 1);
		}
		if (nuMap.equals(num2)) {
			return true;
		} else {
			return false;
		}
	}

}
