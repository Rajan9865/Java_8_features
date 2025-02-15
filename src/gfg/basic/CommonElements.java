/**
 * 
 */
package gfg.basic;

import java.util.HashSet;
import java.util.Iterator;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class CommonElements {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 4, 7, 9 };
		int[] arr2 = { 2, 3, 5, 7, 8 };
		System.out.println("common elements ");
		findcommon(arr1, arr2);
	}

	/**
	 * @param arr1
	 * @param arr2
	 */
	private static void findcommon(int[] arr1, int[] arr2) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int num : arr1) {
			hashSet.add(num);
		}
		for (int num : arr2) {
			if (hashSet.contains(num)) {
				System.out.print(num + " ");
			}
		}
	}
}
